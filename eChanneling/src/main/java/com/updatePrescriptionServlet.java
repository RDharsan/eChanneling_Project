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
 * Servlet implementation class updatePrescriptionServlet
 */
@WebServlet("/updatePrescriptionServlet")
public class updatePrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=request.getParameter("id");
		String pid=request.getParameter("pid");
		String email=request.getParameter("email");
		String med1=request.getParameter("med1");
		String med2=request.getParameter("med2");
		String med3=request.getParameter("med3");
		String oth=request.getParameter("oth");
		
		boolean isTrue;
		isTrue=DoctorDBUtil.updatePrescription(id, pid, email, med1, med2, med3, oth);
		
		 if(isTrue==true) {
			 List<Prescription> presDetails=DoctorDBUtil.getPrescriptionDetails(id);
			 request.setAttribute("presDetails", presDetails);
			 
			  RequestDispatcher dis=request.getRequestDispatcher("displayPres.jsp");
			  dis.forward(request, response);
		  }
		  else {
			  List<Prescription> presDetails=DoctorDBUtil.getPrescriptionDetails(id);
			  request.setAttribute("presDetails", presDetails);
			  RequestDispatcher dis=request.getRequestDispatcher("displayPres.jsp");
			  dis.forward(request, response);
		  }
	}

}
