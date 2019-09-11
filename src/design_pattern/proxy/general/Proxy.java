package design_pattern.proxy.general;


/**
 * 代理模式
 * Proxy代理主题角色
 * @author 从零跟我学Java
 *
 */
public class Proxy implements Subject {
	
	private Subject subject; //要代理哪个实现类
	
	public Proxy() {
	}
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		before();
		subject.request();
		after();
	}
	
	private void before() {
		System.out.println("调用委托类的方法之前...处理代理类自己的逻辑...");
	}
	
	private void after() {
		System.out.println("调用委托类的方法之后...处理代理类自己的逻辑...");
	}
}
