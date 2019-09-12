package design_pattern.proxy.game.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

	Object obj = null; // 被代理的对象

	public GamePlayIH(Object obj) {
		this.obj = obj;
	}

	/**
	 * 调用被代理的方法
	 * 
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}
}
