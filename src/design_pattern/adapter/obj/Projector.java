package design_pattern.adapter.obj;

/**
 * 演示适配器模式 - 对象适配器
 * 
 * @author 程序猿大头
 * 
 *         投影仪类
 */
public class Projector {

	public static void main(String[] args) {
		Hdmi hdmi = new Adapter(new MacBook());
		hdmi.provideHdmi();
	}

}
