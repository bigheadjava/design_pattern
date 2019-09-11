package design_pattern.proxy.game.v3;

import java.text.ParseException;

public class Demo {

	public static void main(String[] args) throws ParseException {
		IGamePlayer proxy = new GamePlayerProxy("孙悟空"); //代练
		proxy.login("monkey", "password");
		proxy.killBoss();
		proxy.upgrade();
		proxy.exit();
	}

}
