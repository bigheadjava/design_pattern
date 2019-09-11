package design_pattern.proxy.game.v4;

import java.text.ParseException;

import design_pattern.util.DateUtil;

public class GamePlayer implements IGamePlayer {
	private String name; // 玩家名字或游戏角色名字

	private IGamePlayer proxy; // 当前对象的代理是谁

	public GamePlayer() {
	}

	public GamePlayer(String name) throws Exception {
		this.name = name;
	}

	@Override
	public void login(String loginName, String password) throws ParseException {
		if (isProxy()) {
			System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 登录名为[" + loginName
					+ "]的玩家登陆游戏成功...");
		} else {
			System.err.println("你不是我指定的代练，你无权为我代练...");
		}
	}

	@Override
	public void killBoss() throws ParseException {

		if (isProxy()) {
			System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 玩家[" + name + "]正在打怪...");
		} else {
			System.err.println("你不是我指定的代练，你无权为我代练...");
		}
	}

	@Override
	public void upgrade() throws ParseException {

		if (isProxy()) {
			System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 玩家[" + name + "]升了一级...");
		} else {
			System.err.println("你不是我指定的代练，你无权为我代练...");
		}
	}

	@Override
	public void exit() throws ParseException {

		if (isProxy()) {
			System.out
					.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 玩家[" + name + "]退出了游戏...");
		} else {
			System.err.println("你不是我指定的代练，你无权为我代练...");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		proxy = new GamePlayerProxy(this);
		return proxy;
	}

	/**
	 * 检查是否是指定的代练
	 * 
	 * @return
	 */
	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		}
		return true;
	}

}
