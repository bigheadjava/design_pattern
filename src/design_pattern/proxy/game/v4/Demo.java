package design_pattern.proxy.game.v4;

public class Demo {

	public static void main(String[] args) throws Exception {
		IGamePlayer player = new GamePlayer("孙悟空"); 
		
		
		IGamePlayer proxy =  new GamePlayerProxy(player);
		proxy.login("monkey", "password");
		proxy.killBoss();
		proxy.upgrade();
		proxy.exit();
	}

}
