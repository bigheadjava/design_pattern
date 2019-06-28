package design_pattern.singleton.lazy;

/**
 * 懒汉式单例模式 - 非线程安全
 * 
 * @author 程序猿大头
 *
 */
public class LazySingleton {
	private static LazySingleton ls;

	/**
	 * 构造方法私有
	 */
	private LazySingleton() {

	}
	
	/**
	 * 提供给外界获取实例的方法
	 * 
	 * @return
	 */
	public static LazySingleton getInstance() {
		if (ls == null) {
			return new LazySingleton();
		}
		return ls;
	}
}
