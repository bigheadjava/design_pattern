package design_pattern.factory.simple;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         园丁类
 *
 */
public class Gardener {

	/**
	 * 静态工厂方法 - 负责创建水果实例
	 * 
	 * @param what
	 * @return
	 */
	public static Fruit factory(String what) {
		Fruit fruit;
		switch (what) {
		case "Apple":
			fruit = new Apple();
			break;
		case "Grape":
			fruit = new Grape();
			break;
		case "Orange":
			fruit = new Orange();
			break;
		default:
			fruit = null;
			break;
		}
		return fruit;
	}
}
