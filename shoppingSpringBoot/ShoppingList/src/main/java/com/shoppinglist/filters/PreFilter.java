package com.shoppinglist.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext rc=RequestContext.getCurrentContext();
		HttpServletRequest hsr= rc.getRequest();
		System.out.println(hsr.getMethod());
		return null;
	}

	@Override
	public String filterType() {
		return "Pre-Filter";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
