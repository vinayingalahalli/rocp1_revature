package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);
		
		if(session==null) {
			PrintWriter out=response.getWriter();
			out.print("<center><h1>Please access our app from first page</h1></center>");
			out.print("<center><a href='/session_demo'>Click Here For FirstPage</a></center>");
		}else {
			User user=(User) session.getAttribute("user");
			user.setQualification(request.getParameter("qualification"));
			user.setMarks(Double.parseDouble(request.getParameter("marks")));
			user.setUniversity(request.getParameter("university"));
			response.sendRedirect("three.html");
		}
		
		
		
		
		
	}

}
