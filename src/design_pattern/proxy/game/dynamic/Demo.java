package design_pattern.proxy.game.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.ParseException;

public class Demo {

	public static void main(String[] args) throws ParseException {
		IGamePlayer player = new GamePlayer("孙悟空"); // 创建玩家
		InvocationHandler handler = new GamePlayIH(player); // 创建Handler
		ClassLoader loader = player.getClass().getClassLoader(); // 获得class loader
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[] { IGamePlayer.class }, handler);
		proxy.login("monkey", "password");
		proxy.killBoss();
		proxy.upgrade();
		proxy.exit();
	}

}
