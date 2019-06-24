package design_pattern.decorator.pkg1;

/**
 * 演示装饰器模式
 * 
 * @author 程序猿大头
 * 
 */
public class Decorator3 implements A {

	private A a;

	public Decorator3(A a) {
		this.a = a;
	}
	
	@Override
	public void method() {
		a.method();
		method2();
	}

	// 扩展的功能
	public void method2() {
		System.out.println("method3() from Decorator3 ...");
	}

}
