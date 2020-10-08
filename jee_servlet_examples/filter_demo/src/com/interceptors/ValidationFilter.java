package com.interceptors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class ValidationFilter
 */
public class ValidationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ValidationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//pre processing logic
	//	System.out.println("Hello from Filter");
		String contact=request.getParameter("contact");
		if(contact.matches("\\+1-[0-9]{10}")) {
			chain.doFilter(request, response); //connects the next filter or the servlet
			//post processing logic
			//System.out.println("Bye Bye from Filter");
		}else {
			PrintWriter out=response.getWriter();
			request.getRequestDispatcher("index.html").include(request, response);
			out.print("<span style='color:red;'>Entered contact "+contact+" is Invalid</span>");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
