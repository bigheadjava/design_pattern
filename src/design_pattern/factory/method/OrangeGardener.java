package design_pattern.factory.method;

/**
 * 演示工厂方法模式
 * 
 * @author 程序猿大头
 * 
 *         橘子园丁类
 */
public class OrangeGardener implements Gardener {

	@Override
	public Fruit factory() {
		return new Orange();
	}

}
