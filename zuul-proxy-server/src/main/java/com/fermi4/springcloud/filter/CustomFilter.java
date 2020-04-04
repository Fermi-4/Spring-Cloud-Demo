package com.fermi4.springcloud.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class CustomFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(CustomFilter.class);
	
	/**
	 * logic to determine whether or not we should execute this filter
	 */
	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		//access to entire Zuul context
		RequestContext context = RequestContext.getCurrentContext();
		
		//get the http request
		HttpServletRequest request = context.getRequest();
		
		//log the request
		logger.info("%s request %s", request.getMethod(), request.getRequestURL());
		return null;
	}

	/**
	 * pre
	 * post
	 * route
	 * error
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * if you have more filters you can specify here what the order should be
	 */
	@Override
	public int filterOrder() {
		return 1;
	}

}
