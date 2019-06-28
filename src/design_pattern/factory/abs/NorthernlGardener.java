package design_pattern.factory.abs;

/**
 * 演示抽象工厂
 * 
 * @author 程序猿大头
 * 
 */
public class NorthernlGardener implements Gardener {

	@Override
	public Fruit createFruit(String name) {
		return new NorthernFruit(name);
	}

	@Override
	public Veg createVeg(String name) {
		return new NorthernVeg(name);
	}

}
