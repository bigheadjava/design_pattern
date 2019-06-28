package design_pattern.template_method;

/**
 * 演示模版方法模式
 * 
 * @author 程序猿大头
 * 父类，一个抽象类
 */
public abstract class AbstractClass {
	/**
	 * 模版方法
	 */
	public void templateMethod() {
		operation1();
		operation2();
		operation3();
	}

	/**
	 * 基本方法，由子类去实现
	 */
	protected abstract void operation1();

	/**
	 * 基本方法，由子类去实现
	 */
	protected abstract void operation2();

	/**
	 * 基本方法，由子类去实现
	 */
	protected abstract void operation3();
}
