package com.adobe.www.context;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action类实现指定的借口（ServletRequestAware，ServletResponseAware，ServletContextAware，application）
 * 让Strut2框架在运行时向Action实例注入parameters,request,seesion,application到对应的Map对象。
 * @author Mac
 */
@SuppressWarnings("serial")
public class ContextAction02 extends ActionSupport 
	implements ServletRequestAware, ServletResponseAware, ServletContextAware, SessionAware{

	HttpServletRequest request;
	
	HttpServletResponse response;
	
	Map sessionMap;
	
	ServletContext sc;
	
	public String test(){
		System.out.println("ContextAction *********** test()");
		
		request.setAttribute("username", "username_request");
		
		sessionMap.put("username", "username_session");
		
		sc.setAttribute("username", "username_application");
		
		
		return "attr";
	}

	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
		
	}

	public void setServletContext(ServletContext context) {
		this.sc = context;
		
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
		
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}
	
}
