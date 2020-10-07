package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie c1=new Cookie("FirstName", request.getParameter("fname"));
		response.addCookie(c1);
		
		Cookie c2=new Cookie("LastName", request.getParameter("lname"));
		response.addCookie(c2);
		
		Cookie c3=new Cookie("Email", request.getParameter("email"));
		response.addCookie(c3);
		
		Cookie c4=new Cookie("Contact", request.getParameter("contact"));
		response.addCookie(c4);
		
		response.sendRedirect("two.html");
	}

}
