package design_pattern.adapter.obj;

/**
 * 演示适配器模式 - 对象适配器
 * 
 * @author 程序猿大头
 * 
 *         MacBook实现了Type-C接口
 */ 
public class MacBook implements TypeC {

	@Override
	public void provideTypeC() {
		System.out.println("使用了Type-C接口...");
	}

}
