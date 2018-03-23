package org.sevenzero.cglibdemo.proxy2;


public class LoginProxyTest {

	public static void main(String[] args) {
		
		LoginInterceptor interceptor = new LoginInterceptor();
		LoginImpl login = (LoginImpl) interceptor.getProxy(LoginImpl.class);
		login.login("libin");
		
		
	}

}
