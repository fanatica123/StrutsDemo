/*package com.hqyj.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyExcludeMethodInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		System.out.println("MyExcludeMethodInterceptor-->before");
		String result = arg0.invoke();
		System.out.println("MyExcludeMethodInterceptor-->after");
		return result;
	}
}

*/