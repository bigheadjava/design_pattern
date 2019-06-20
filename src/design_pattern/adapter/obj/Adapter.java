package design_pattern.adapter.obj;

/**
 * 演示适配器模式 - 对象适配器
 * 
 * @author 程序猿大头
 * 
 *         转换器Adapter
 */
public class Adapter implements Hdmi {

	private TypeC macBook; // MacBook对象

	public Adapter() {

	}

	public Adapter(TypeC macBook) {
		this.macBook = macBook;
	}

	@Override
	public void provideHdmi() {
		macBook.provideTypeC();
	}

}
