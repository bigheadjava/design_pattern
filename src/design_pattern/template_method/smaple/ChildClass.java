package design_pattern.template_method.smaple;

/**
 * 演示模版方法模式
 * 
 * @author 程序猿大头
 * 子类，继承于抽象类
 */
public class ChildClass extends AbstractClass {

	@Override
	protected void operation1() {
		System.out.println("子类实现operation1()方法...");
	}

	@Override
	protected void operation2() {
		System.out.println("子类实现operation2()方法...");
	}

	@Override
	protected void operation3() {
		System.out.println("子类实现operation3()方法...");
	}

}
