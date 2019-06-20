package design_pattern.adapter.classes;

/**
 * 演示适配器模式 - 类适配器
 * 
 * @author 程序猿大头
 * 
 *         测试类
 */
public class Demo {

	public static void main(String[] args) {
		Hdmi hdmi = new Adapter();
		hdmi.provideHdmi();
	}

}
