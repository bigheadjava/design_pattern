package design_pattern.proxy.game.v2;

import java.text.ParseException;

public class Demo {

	public static void main(String[] args) throws ParseException {
		IGamePlayer player = new GamePlayer("孙悟空"); //玩家
		IGamePlayer proxy = new GamePlayerProxy(player); //代练
		proxy.login("monkey", "password");
		proxy.killBoss();
		proxy.upgrade();
		proxy.exit();
	}

}
