package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deletePrescriptionServlet
 */
@WebServlet("/deletePrescriptionServlet")
public class deletePrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=request.getParameter("id");
		
		boolean isTrue;
		isTrue=DoctorDBUtil.deletePrescription(id);
		
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("prescription.jsp");
			dis.forward(request, response);
		}else {
			List<Prescription> presDetails=DoctorDBUtil.getPrescriptionDetails(id);
			request.setAttribute("presDetails", presDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("displayPres.jsp");
			dis.forward(request, response);
		}
		
	}

}
