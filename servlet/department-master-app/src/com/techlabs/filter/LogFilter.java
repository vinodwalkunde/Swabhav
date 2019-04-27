package com.techlabs.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
//@WebFilter("/logfilter")
@WebFilter(urlPatterns = {"/*"}, initParams = { 
		   @WebInitParam(name = "test-param", value = "Initialization Paramter")}) 
public class LogFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 // Get the IP address of client machine.
	      String ipAddress = request.getRemoteAddr();

	      // Log the IP address and current timestamp.
	      System.out.println("IP "+ ipAddress + ", Time " + new Date().toString());

	      HttpServletRequest url = ((HttpServletRequest) request);
	        System.out.println("Url: " + url.getRequestURL());
	        
	      // Pass request back down the filter chain
	      chain.doFilter(request,response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		 String testParam = config.getInitParameter("test-param");
		    //Print the init parameter 
	      System.out.println("Test Param: " + testParam);
	}

}
