package com.crnts.filters;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements javax.servlet.Filter {
//	@Override
public void init(FilterConfig filterConfig) throws ServletException {
}
 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
	     System.out.println("-----Filter is invoked--------");
	     Instant start=Instant.now();
	     System.out.println("-----Filter is invoked");
	     chain.doFilter(request, response);
	     Instant end=Instant.now();
	     Duration duration=Duration.between(start, end);
	     System.out.println("---------Time taken---------"+duration.toMillis());

	} 
	 
}

/*

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	// TODO Auto-generated method stub
	Instant start=Instant.now();
     System.out.println("-----Filter is invoked");
     chain.doFilter(request, response);
     Instant end=Instant.now();
     Duration duration=Duration.between(start, end);
     System.out.println("Time taken"+duration.toMillis());
	
}
*/