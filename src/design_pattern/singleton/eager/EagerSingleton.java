package design_pattern.singleton.eager;

/**
 * 饿汉式单例模式
 * 
 * @author 程序猿大头
 *
 */
public class EagerSingleton {

	private static final EagerSingleton es = new EagerSingleton();

	/**
	 * 把构造方法设为私有
	 */
	private EagerSingleton() {

	}

	/**
	 * 提供给外界获取实例的方法
	 * 
	 * @return
	 */
	public static EagerSingleton getInstance() {
		return es;
	}
}
