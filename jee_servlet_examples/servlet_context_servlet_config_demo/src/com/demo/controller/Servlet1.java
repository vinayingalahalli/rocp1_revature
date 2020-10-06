package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h2>Accessing config parameters of Servlet1 in Servlet1</h2>");
		ServletConfig config=getServletConfig();
		out.print("<h3>Query1 : "+config.getInitParameter("query1")+"</h3>");
		out.print("<h3>Query2 : "+config.getInitParameter("query2")+"</h3>");
		out.print("<h3>Query3 : "+config.getInitParameter("query3")+"</h3>");
		
		out.print("<br/><br/><h2>Accessing context parameters in Servlet1</h2>");
		ServletContext context=getServletContext();
		out.print("<h3>Driver : "+context.getInitParameter("driver")+"</h3>");
		out.print("<h3>Url : "+context.getInitParameter("url")+"</h3>");
		out.print("<h3>Username : "+context.getInitParameter("username")+"</h3>");
		out.print("<h3>Password : "+context.getInitParameter("password")+"</h3>");
	}

}
