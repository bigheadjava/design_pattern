package design_pattern.proxy.game.v4;

import java.text.ParseException;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer;

	public GamePlayerProxy() {
		super();
	}

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
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

	/**
	 * 代练的代练暂时还没有，返回自身
	 */
	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
