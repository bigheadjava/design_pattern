package design_pattern.factory.abs;

/**
 * 演示抽象工厂
 * 
 * @author 程序猿大头
 * 
 */
public class TropicalVeg implements Veg {
	private String name;

	public TropicalVeg() {
		super();
	}

	public TropicalVeg(String name) {
		super();
		this.name = name;
		System.out.println("创建了" + name + "...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
