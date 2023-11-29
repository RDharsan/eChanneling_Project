package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DregServlet")
public class DregServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String spe=request.getParameter("spe");
		String phone=request.getParameter("phone");
		String dob=request.getParameter("dob");
		String Nic=request.getParameter("nic");
		String branch=request.getParameter("branch");
		String passD=request.getParameter("pass");
	
		
		boolean isTrue;
		
		isTrue=DoctorDBUtil.getRegister(name, email,spe,phone, dob, Nic, branch, passD);
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("Dlogin.jsp");
			 dis.forward(request, response);
		}else {
			RequestDispatcher dis2=request.getRequestDispatcher("Dreg.jsp");
			dis2.forward(request, response);
		}
		
	}

}
