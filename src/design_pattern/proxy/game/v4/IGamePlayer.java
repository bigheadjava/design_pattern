package design_pattern.proxy.game.v4;

import java.text.ParseException;

public interface IGamePlayer {
	// 登陆游戏
	public void login(String loginName, String password) throws ParseException ;

	// 打怪
	public void killBoss() throws ParseException ;

	// 升级
	public void upgrade() throws ParseException ;
	
	//退出游戏
	public void exit() throws ParseException ;
	
	//每个玩家都可以找自己的代练
	public IGamePlayer getProxy();
}
