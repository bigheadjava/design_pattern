package design_pattern.decorator.pkg1;

/**
 * 演示装饰器模式
 * 
 * @author 程序猿大头
 * 
 */
public class Decorator1 implements A {
	
	private A a;
	
	public Decorator1(A a) {
		this.a = a;
	}

	@Override
	public void method() {
		a.method();
		method1();
	}
	//扩展的功能
	public void method1() {
		System.out.println("method1() from Decorator1 ...");
	}

}
