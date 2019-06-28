package design_pattern.factory.abs;

/**
 * 演示抽象工厂
 * 
 * @author 程序猿大头
 * 
 */
public interface Gardener {
	public Fruit createFruit(String name);

	public Veg createVeg(String name);
}
