package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DoctorDBUtil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;

	//username password validation
	public static List<Doctor>validate(String Email,String passWord){
			
		ArrayList<Doctor> doc=new ArrayList<>();
		
				
		//validate
			try {
				
				con=DbConnect.getConnection();//database connection
				stmt=con.createStatement();
				String sql="select * from doctorinfo where email='"+Email+"' and password='"+passWord+"'";
				rs=stmt.executeQuery(sql);
				
				if(rs.next()) {
				 	int id=rs.getInt(1);
				 	String name=rs.getString(2);
				 	String email=rs.getString(3);
				 	String phone=rs.getString(4);
				 	String dob=rs.getString(5);
				 	String Nic=rs.getString(6);
				 	String branch=rs.getString(7);
				 	String pw=rs.getString(8);
				 	String spe=rs.getString(9);				 	
				 	
				 	Doctor d = new Doctor(id,name,email,phone,dob,Nic,branch,pw,spe); 
				 	doc.add(d);
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return doc;
	}
//-----------------------------------------------------------------------------------------------------------------------	
	//Registration 
	public static boolean getRegister(String name,String email,String spe,String phone,String dob,String nic,String branch,String password) {
		
		boolean isSuccess=false;
		
		try {
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="insert into doctorinfo values(0,'"+name+"','"+email+"','"+phone+"','"+dob+"','"+nic+"','"+branch+"','"+password+"','"+spe+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			
		}
		
		return isSuccess;
		
	}
	
//-----------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean updateDoctor(String id,String name,String email,String spe,String phone,String dob,String nic,String branch,String password) {
		
		try {
			
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="update doctorinfo set name='"+name+"',email='"+email+"',phone='"+phone+"',DOB='"+dob+"',NIC='"+nic+"',branch='"+branch+"',password='"+password+"',Specialization='"+spe+"'"
					+"where id='"+id+"'";
			
			int rs=stmt.executeUpdate(sql);
			
			
			if(rs >0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}
	//---------------------------------------------------------------------------------------------------------------------
	
	public static List<Doctor> getDoctorDetails(String id){
		int convertedId=Integer.parseInt(id);
		
		ArrayList<Doctor> doc=new ArrayList<>();
		
		try {
			
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="select * from doctorinfo where id='"+convertedId+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int Id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String phone=rs.getString(4);
				String dob=rs.getString(5);
				String nic=rs.getString(6);
				String br=rs.getString(7);
				String pass=rs.getString(8);
				String spe=rs.getString(9);
				
				Doctor dc=new Doctor(Id,name,email,phone,dob,nic,br,pass,spe);
				doc.add(dc);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return doc;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	public static List<patientSymtom>view(String pid){
		int convertedPId=Integer.parseInt(pid);
		
		ArrayList<patientSymtom> pt=new ArrayList<>();
		
		try {
			con=DbConnect.getConnection();//database connection
			stmt=con.createStatement();
			String sql="select * from patientsymtoms where pid='"+convertedPId+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				int Id=rs.getInt(1);
				String name=rs.getString(2);
				String appid=rs.getString(3);
				String email=rs.getString(4);
				String ps1=rs.getString(5);
				String ps2=rs.getString(6);
				String ps3=rs.getString(7);
				String ps4=rs.getString(8);
				String oth=rs.getString(9);
				
				patientSymtom p=new patientSymtom(Id, name, appid, email, ps1, ps2, ps3, ps4, oth);
				pt.add(p);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return pt;
	}
	//---------------------------------------------------------------------------------------------------------------
	public static boolean addPrescription(String pid,String email,String med1,String med2,String med3,String other) {
		int convertedPId=Integer.parseInt(pid);
		boolean isSuccess=false;
		
		try {
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="insert into prescription values(0,'"+convertedPId+"','"+email+"','"+med1+"','"+med2+"','"+med3+"','"+other+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			
		}
		
		return isSuccess;
		
	}
	//--------------------------------------------------------------------------------------------------------------------
	public static List<Prescription>validatePres(String id){
		int convertedId=Integer.parseInt(id);
		ArrayList<Prescription> pres=new ArrayList<>();
		
				
		//validate
			try {
				
				con=DbConnect.getConnection();//database connection
				stmt=con.createStatement();
				String sql="select * from prescription where ID='"+convertedId+"'";
				rs=stmt.executeQuery(sql);
				
				if(rs.next()) {
				 	int Id=rs.getInt(1);
				 	int pid=rs.getInt(2);
				 	String email=rs.getString(3);
				 	String med1=rs.getString(4);
				 	String med2=rs.getString(5);
				 	String med3=rs.getString(6);
				 	String ot=rs.getString(7);
				 					 	
				 	
				 	Prescription p = new Prescription(Id,pid,email,med1,med2,med3,ot); 
				 	pres.add(p);
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return pres;
	}
	//-------------------------------------------------------------------------------------------------------------------
	public static boolean updatePrescription(String id,String pid,String email,String med1,String med2,String med3,String oth) {
		int convertedId=Integer.parseInt(id);
		int convertedpid=Integer.parseInt(pid);
		
		try {
			
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="update prescription set email='"+email+"',medicine1='"+med1+"',medicine2='"+med2+"',medicine3='"+med3+"',other_medicine='"+oth+"'"
					+"where id='"+id+"'";
			
			int rs=stmt.executeUpdate(sql);
			
			
			if(rs >0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}
	
	//------------------------------------------------------------------------------------------------------------------------------
	public static List<Prescription> getPrescriptionDetails(String id){
		int convertedId=Integer.parseInt(id);
		
		ArrayList<Prescription> ps=new ArrayList<>();
		
		try {
			
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="select * from prescription where id='"+convertedId+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int Id=rs.getInt(1);
			 	int pid=rs.getInt(2);
			 	String email=rs.getString(3);
			 	String med1=rs.getString(4);
			 	String med2=rs.getString(5);
			 	String med3=rs.getString(6);
			 	String ot=rs.getString(7);
				
				
				Prescription pr=new Prescription(Id,pid,email,med1,med2,med3,ot);
				ps.add(pr);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ps;
	}
	//-------------------------------------------------------------------------------------------------------------------
	
	public static boolean deletePrescription(String id) {
		int convertedId=Integer.parseInt(id);
		
		try {
			con=DbConnect.getConnection();
			stmt=con.createStatement();
			String sql="delete from prescription where id='"+convertedId+"'";
			
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
}
