package design_pattern.proxy.game.v1;

import java.text.ParseException;

public class Demo {

	public static void main(String[] args) throws ParseException {
		IGamePlayer player = new GamePlayer("孙悟空");
		player.login("monkey", "password");
		player.killBoss();
		player.upgrade();
		player.exit();
	}

}
