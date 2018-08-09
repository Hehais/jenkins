package com.uzengroup.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.tools.config.ValidScope;
import org.apache.velocity.tools.generic.SafeConfig;

@ValidScope({"request"})
public class BaseTag extends SafeConfig{
	protected HttpServletRequest request;
	protected HttpServletResponse response;

	public void setRequest(HttpServletRequest request){
		if (request == null){
			throw new NullPointerException("request should not be null");
		}
		this.request = request;
	}

	public void setResponse(HttpServletResponse response){
		if (response == null){
			throw new NullPointerException("response should not be null");
		}
		this.response = response;
	}

}
