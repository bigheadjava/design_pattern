package design_pattern.factory.method;

/**
 * 演示演示工厂方法模式
 * 
 * @author 程序猿大头
 * 
 *         水果接口
 *
 */
public interface Fruit {
	/**
	 * 种植
	 */
	public void plant();

	/**
	 * 生长
	 */
	public void grow();

	/**
	 * 收获
	 */
	public void harvest();
}
