package com.crnts.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidateFilter implements javax.servlet.Filter {
//	@Override
public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println("----------Validate Init----------------");
	//It will fetch the values you given in init-param of this filter in web.xml
	System.out.println(filterConfig.getInitParameter("username"));
	System.out.println(filterConfig.getInitParameter("password"));
}

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	// TODO Auto-generated method stub

	System.out.println("---------ValidateFilter------------");
	ServletContext context=request.getServletContext();
	//It will fetch the parameters which you mention in contextparam  
	System.out.println(context.getInitParameter("username"));
	System.out.println(context.getInitParameter("password"));
	//It will fetch the values which you given in url
    System.out.println(request.getParameter("user"));
    System.out.println(request.getParameter("pass"));

}

}
