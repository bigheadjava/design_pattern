package design_pattern.singleton.lazy;

/**
 * 懒汉式单例模式 - 线程安全 (静态内部类)
 * 
 * @author 程序猿大头
 *
 */
public class LazySingletonV3 {

	private static class ClassHolder {
		private static final LazySingletonV3 ls = new LazySingletonV3();
	}

	/**
	 * 构造方法私有
	 */
	private LazySingletonV3() {

	}

	/**
	 * 提供给外界获取实例的方法
	 * 
	 * @return
	 */
	public static LazySingletonV3 getInstance() {
		return LazySingletonV3.ClassHolder.ls;
	}
}
