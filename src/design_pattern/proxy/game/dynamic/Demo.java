package design_pattern.proxy.game.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.ParseException;

public class Demo {

	public static void main(String[] args) throws ParseException {
		IGamePlayer player = new GamePlayer("孙悟空"); // 创建玩家，真实角色
		InvocationHandler handler = new GamePlayerProxy(player); // 创建Handler，要代理哪个真实角色，就将该角色传进去，最后是通过该真实角色来调用其方法的
		
		/**
		 * Proxy.newProxyInstance方法用来创建动态代理对象，该方法有三个参数:
		 * 第一个参数: 指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器。
		 * 第二个参数: 一个Interface对象的数组，表示将给需要代理的对象提供一组什么接口，如果提供了一组接口给它，
		 * 	那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了。其实就是要实现和目标对象一样的接口，
		 * 	所以只需要拿到目标对象的实现接口 
		 * 第三个参数表示这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法  
		 * 
		 */
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(),
				new Class[] { IGamePlayer.class }, handler);
		proxy.login("monkey", "password");
		proxy.killBoss();
		proxy.upgrade();
		proxy.exit();
	}

}
