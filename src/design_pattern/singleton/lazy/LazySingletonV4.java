package design_pattern.singleton.lazy;

/**
 * 懒汉式单例模式 - 线程安全 (枚举)
 * 
 * @author 程序猿大头
 *
 */
public enum LazySingletonV4 {
	INSTANCE;
	
	public void method() {
		System.out.println("...");
	}
}
