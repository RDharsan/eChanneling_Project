package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/prescriptionServet")
public class prescriptionServet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pid=request.getParameter("pid");
		String email=request.getParameter("email");
		String med1=request.getParameter("med1");
		String med2=request.getParameter("med2");
		String med3=request.getParameter("med3");
		String ot=request.getParameter("ot");
		
		boolean isTrue;
		isTrue=DoctorDBUtil.addPrescription(pid, email, med1, med2, med3, ot);
		
		if(isTrue==true) {
			 RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
			 dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
