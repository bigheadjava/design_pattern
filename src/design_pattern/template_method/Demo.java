package design_pattern.template_method;

/**
 * 演示模版方法模式
 * 
 * @author 程序猿大头 
 * 测试类
 */
public class Demo {

	public static void main(String[] args) {
		AbstractClass ac = new ChildClass();
		ac.templateMethod();
	}

}
