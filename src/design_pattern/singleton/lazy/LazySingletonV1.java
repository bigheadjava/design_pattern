package design_pattern.singleton.lazy;

/**
 * 懒汉式单例模式 - 线程安全 (同步锁)
 * 
 * @author 程序猿大头
 *
 */
public class LazySingletonV1 {
	private static LazySingletonV1 ls;

	/**
	 * 构造方法私有
	 */
	private LazySingletonV1() {

	}
	
	/**
	 * 提供给外界获取实例的方法
	 * 
	 * @return
	 */
	public synchronized static LazySingletonV1 getInstance() {
		if (ls == null) {
			return new LazySingletonV1();
		}
		return ls;
	}
}
