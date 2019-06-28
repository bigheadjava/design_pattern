package design_pattern.factory.abs;

/**
 * 演示抽象工厂
 * 
 * @author 程序猿大头
 * 
 */
public class TropicalGardener implements Gardener {

	@Override
	public Fruit createFruit(String name) {
		return new TropicalFruit(name);
	}

	@Override
	public Veg createVeg(String name) {
		return new TropicalVeg(name);
	}

}
