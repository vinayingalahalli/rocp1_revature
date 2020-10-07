package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		
		HttpSession session=request.getSession(false);
		PrintWriter out=response.getWriter();
		if(session==null) {
			
			out.print("<center><h1>Please access our app from first page</h1></center>");
			out.print("<center><a href='/session_demo'>Click Here For FirstPage</a></center>");
		}else {
			User user=(User) session.getAttribute("user");
			user.setCertification(request.getParameter("certification"));
			user.setProvider(request.getParameter("provider"));
			user.setVersion(Float.parseFloat(request.getParameter("version")));
			user.setValidity(Integer.parseInt(request.getParameter("validity")));
			out.print("<h2>User data is below</h2>");
			out.print("<h3>"+user+"</h3>");
			out.print("<h3>Session Id : "+session.getId()+"</h3>");
			out.print("<h3>Session Creation Time : "+new Date(session.getCreationTime())+"</h3>");
			
			//session.setMaxInactiveInterval(1200);
			//session.getMaxInactiveInterval();
			session.invalidate(); // expires the session
			
			
		}
	
	}

}
