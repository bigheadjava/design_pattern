package design_pattern.factory.simple;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         客户类
 *
 */
public class Client {

	public static void main(String[] args) {
		Fruit f1 = Gardener.factory("Apple");
		f1.plant();
		f1.grow();
		f1.harvest();
		System.out.println("-----------------------");
		Fruit f2 = Gardener.factory("Grape");
		f2.plant();
		f2.grow();
		f2.harvest();
	}

}
