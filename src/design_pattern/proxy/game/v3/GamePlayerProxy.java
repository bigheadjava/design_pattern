package design_pattern.proxy.game.v3;

import java.text.ParseException;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer;

	public GamePlayerProxy() {
		super();
	}

	public GamePlayerProxy(String name) {
		try {
			this.gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void login(String loginName, String password) throws ParseException {
		this.gamePlayer.login(loginName, password);

	}

	@Override
	public void killBoss() throws ParseException {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() throws ParseException {
		this.gamePlayer.upgrade();
	}

	@Override
	public void exit() throws ParseException {
		this.gamePlayer.exit();
	}

}
