package design_pattern.proxy.game.v5;

import java.text.ParseException;

public class GamePlayerProxy implements IGamePlayer, IProxy{

	private IGamePlayer gamePlayer;

	public GamePlayerProxy() {
		super();
	}

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	@Override
	public void login(String loginName, String password) throws ParseException {
		before();
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
		after();
	}

	/**
	 * 代练的代练暂时还没有，返回自身
	 */
	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	@Override
	public void before() {
		System.out.println("请支付代练费用3000元...");
	}

	@Override
	public void after() {
		System.out.println("代练完成，提供相关证据证明代练完成，并交付玩家...");
	}
	

}
