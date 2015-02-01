package com.adobe.www.aop;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {

	public String save(){
		System.out.println("UserAction ************* save()");
		return "success";
	}
	
}
