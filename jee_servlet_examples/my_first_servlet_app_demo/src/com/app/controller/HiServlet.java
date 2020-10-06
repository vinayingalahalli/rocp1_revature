package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiServlet
 */
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Hello World from doGet() method of HiServlet</h1>");
		out.print("<h2>Hello "+request.getParameter("fname")+"</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Hello World from doPost() method of HiServlet</h1>");
		out.print("<h2>Hello "+request.getParameter("fname")+"</h2>");
		out.print("<h2>LastName :  "+request.getParameter("lname")+"</h2>");
		out.print("<h2>Gender : "+request.getParameter("gender")+"</h2>");
		out.print("<h2>Country :  "+request.getParameter("country")+"</h2>");
		out.print("<h2>Password :  "+request.getParameter("password")+"</h2>");
		out.print("<h2>Hobbies :  "+Arrays.toString(request.getParameterValues("hobby"))+"</h2>");
	}

}
