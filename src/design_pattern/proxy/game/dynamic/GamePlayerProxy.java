package design_pattern.proxy.game.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerProxy implements InvocationHandler {

	Object targetObj = null; // 被代理的对象

	public GamePlayerProxy() {
	}

	public GamePlayerProxy(Object targetObj) {
		this.targetObj = targetObj;
	}

	/**
	 * 调用被代理的方法
	 * 
	 * @param proxy  - 被代理的对象，即真实角色
	 * @param method - 要调用的方法，是真实角色里的方法
	 * @param args   - 方法调用时需要的参数
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//TODO: 在代理真实角色之前可以处理一些自己的逻辑
		Object result = method.invoke(this.targetObj, args);
		if ("login".equalsIgnoreCase(method.getName())) {
			System.err.println("亲爱的玩家，您的账号已经登陆...");
		}
		//TODO: 在代理真实角色之后可以处理一些自己的逻辑
		return result;
	}
}
