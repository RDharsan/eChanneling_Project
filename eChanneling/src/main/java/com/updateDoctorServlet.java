package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateDoctorServlet")
public class updateDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=request.getParameter("did");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String spec=request.getParameter("spe");
		String phone=request.getParameter("phone");
		String dob=request.getParameter("dob");
		String nic=request.getParameter("nic");
		String br=request.getParameter("branch");
		String passw=request.getParameter("password");
		
		boolean isTrue;
		isTrue=DoctorDBUtil.updateDoctor(id, name, email, spec, phone, dob, nic, br, passw);
		
		 if(isTrue==true) {
			 List<Doctor> docDetails=DoctorDBUtil.getDoctorDetails(id);
			 request.setAttribute("docDetails", docDetails);
			 
			  RequestDispatcher dis=request.getRequestDispatcher("doctorInfo.jsp");
			  dis.forward(request, response);
		  }
		  else {
			  List<Doctor> docDetails=DoctorDBUtil.getDoctorDetails(id);
			  request.setAttribute("docDetails", docDetails);
			  RequestDispatcher dis=request.getRequestDispatcher("doctorInfo.jsp");
			  dis.forward(request, response);
		  }
		  
	}

}
