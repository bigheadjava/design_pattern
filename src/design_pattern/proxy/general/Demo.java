package design_pattern.proxy.general;

public class Demo {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Subject proxy = new Proxy(realSubject);
		proxy.request();
	}

}
