package design_pattern.singleton.lazy;

/**
 * 懒汉式单例模式 - 线程安全 (双重检查锁)
 * 
 * @author 程序猿大头
 *
 */
public class LazySingletonV2 {
	private static LazySingletonV2 ls;

	/**
	 * 构造方法私有
	 */
	private LazySingletonV2() {

	}

	/**
	 * 提供给外界获取实例的方法
	 * 
	 * @return
	 */
	public static LazySingletonV2 getInstance() {
		if (ls == null) { //第一次检查，避免不必要的同步
			synchronized (LazySingletonV2.class) {
				if (ls == null) { //第二次检查，保证线程安全
					return new LazySingletonV2();
				}
			}
		}
		return ls;
	}
}
