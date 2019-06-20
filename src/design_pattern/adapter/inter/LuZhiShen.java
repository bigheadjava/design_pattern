package design_pattern.adapter.inter;

/**
 * 演示适配器模式 - 缺省适配器模式
 * 
 * @author 程序猿大头
 * 
 *         鲁智深类
 */
public class LuZhiShen extends Adapter {

	@Override
	public void learnKungfu() {
		System.out.println("鲁智深会武功...");
	}
}
