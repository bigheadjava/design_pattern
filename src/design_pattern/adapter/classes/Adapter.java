package design_pattern.adapter.classes;

/**
 * 演示适配器模式 - 类适配器
 * 
 * @author 程序猿大头
 * 
 *         适配器 - Type-C & HDMI转换器
 */
public class Adapter extends MacBook implements Hdmi {

	@Override
	public void provideHdmi() {
		provideTypeC();
	}

}
