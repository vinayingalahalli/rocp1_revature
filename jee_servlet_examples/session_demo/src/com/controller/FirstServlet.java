package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

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
		
		HttpSession session=request.getSession();
		/*
		 * getSession() or getSession(true) will create a new session which is okay once per user.
		 * 
		 * use getSession() or getSession(true) only at the entry point of the user in the application
		 * 
		 * and in reest of the pages where the respective pages if they should participate in the session
		 * then make use of getSession(false)
		 * 
		 * getSession(false) will not create a new session infact if the session is already created it will participate 
		 * in that session
		 */
		
		User user=new User();
		user.setFirstName(request.getParameter("fname"));
		user.setLastName(request.getParameter("lname"));
		user.setEmail(request.getParameter("email"));
		user.setContact(Long.parseLong(request.getParameter("contact")));	
		
		session.setAttribute("user", user);
		
		response.sendRedirect("two.html");
	}

}
