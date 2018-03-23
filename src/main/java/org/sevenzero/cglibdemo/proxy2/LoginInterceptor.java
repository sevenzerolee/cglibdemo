package org.sevenzero.cglibdemo.proxy2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
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
	
	private Enhancer en = new Enhancer();
	
	public Object getProxy(Class<?> clazz) {
		en.setSuperclass(clazz);
		en.setCallback(this);
		
		return en.create();
	}

	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("### before " + method.getName());
		Object o = proxy.invokeSuper(obj, args);
		System.out.println("### after " + method.getName());
		
		return o;
	}

}
