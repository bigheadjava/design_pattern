package design_pattern.proxy.game.v2;

import java.text.ParseException;

import design_pattern.util.DateUtil;

public class GamePlayer implements IGamePlayer {
	private String name; // 玩家名字或游戏角色名字

	public GamePlayer() {
	}

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String loginName, String password) throws ParseException {
		System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 登录名为[" + loginName + "]的玩家登陆游戏成功...");
	}

	@Override
	public void killBoss() throws ParseException {
		System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 玩家[" + name + "]正在打怪...");
	}

	@Override
	public void upgrade() throws ParseException {
		System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 玩家[" + name + "]升了一级...");
	}

	@Override
	public void exit() throws ParseException {
		System.out.println(DateUtil.dateTimeToDateString(DateUtil.getCurrrentDate()) + ": 玩家[" + name + "]退出了游戏...");
	}

}
