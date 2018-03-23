package org.sevenzero.cglibdemo.proxy;

public class LoginImpl {
	
	public String login(String user) {
		System.out.println("### " + user);
		return "success";
	}

}
