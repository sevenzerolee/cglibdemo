package org.sevenzero.cglibdemo.proxy2;

public class LoginImpl {
	
	public String login(String user) {
		System.out.println("### " + user);
		return "success";
	}

}
