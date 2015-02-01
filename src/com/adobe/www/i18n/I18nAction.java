package com.adobe.www.i18n;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ActionSupport类实现了TextProvider借口，该接口负责提供对各种资源包和他们的底层文本消息的访问机制。
 * .getText()方法按以下顺序搜索相关的属性文件。
 * 
 * @author Mac
 *
 */
@SuppressWarnings("serial")
public class I18nAction extends ActionSupport {

	public String login(){
		System.out.println("I18nAction ************* login()");

		String username = this.getText("items.username");
		System.out.println("username = "+username);

		String psw = this.getText("items.psw");
		System.out.println("password = "+psw);

		return "success";
	}
	
}
