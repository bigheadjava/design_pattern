package design_pattern.decorator.pkg1;

/**
 * 演示装饰器模式
 * 
 * @author 程序猿大头
 * 
 */
public class Demo {

	public static void main(String[] args) {
		A a = new B(); //需要装饰的对象
		Decorator1 d1 = new Decorator1(a);
		d1.method();
		System.out.println();
		System.out.println("--------Split Line--------");
		
		Decorator2 d2 = new Decorator2(d1);
		d2.method();
		System.out.println();
		System.out.println("--------Split Line--------");
		
		Decorator3 d3 = new Decorator3(d2);
		d3.method();
		System.out.println();
		System.out.println("--------Split Line--------");
		
		Decorator2 d22 = new Decorator2(a);
		Decorator3 d33 = new Decorator3(d22);
		d33.method();
	}

}
