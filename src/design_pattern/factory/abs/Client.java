package design_pattern.factory.abs;

/**
 * 演示抽象工厂
 * 
 * @author 程序猿大头
 * 
 */
public class Client {

	public static void main(String[] args) {
		Gardener g = new NorthernlGardener();
		g.createFruit("苹果");
		g.createVeg("莴苣");

		g = new TropicalGardener();
		g.createFruit("芒果");
		g.createVeg("韭菜");
	}

}
