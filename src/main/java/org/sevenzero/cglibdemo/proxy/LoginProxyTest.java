package org.sevenzero.cglibdemo.proxy;

import net.sf.cglib.proxy.Enhancer;

public class LoginProxyTest {

	public static void main(String[] args) {
		
		Enhancer en = new Enhancer();
		en.setSuperclass(LoginImpl.class);
		en.setCallback(new LoginInterceptor());
		
		LoginImpl login = (LoginImpl) en.create();
		login.login("libin");
		
		
	}

}
