package design_pattern.proxy.general;


/**
 * 代理模式
 * RealSubject具体主题角色
 * @author 从零跟我学Java
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("Request from RealSubject - 具体主题角色");
	}

}
