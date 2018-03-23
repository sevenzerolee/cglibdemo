package org.sevenzero.cglibdemo.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @author lb
 * 
 * cglib 动态代理实现方式
 *
 */
public class LoginInterceptor implements MethodInterceptor {

	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("### before " + method.getName());
		Object o = proxy.invokeSuper(obj, args);
		System.out.println("### after " + method.getName());
		
		return o;
	}

}
