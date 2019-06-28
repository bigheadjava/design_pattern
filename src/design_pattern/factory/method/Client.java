package design_pattern.factory.method;

/**
 * 演示工厂方法模式
 * 
 * @author 程序猿大头
 * 
 *         客户类
 */
public class Client {

	public static void main(String[] args) {
		Gardener factory;
		Fruit fruit;
		
		//生产苹果
		factory = new AppleGardener();
		fruit  = factory.factory();
		fruit.plant();
		fruit.grow();
		fruit.harvest();
		
		System.out.println("-----------------------");
		factory = new GrapeGardener();
		fruit  = factory.factory();
		fruit.plant();
		fruit.grow();
		fruit.harvest();
	}

}
