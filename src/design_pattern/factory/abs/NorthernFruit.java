package design_pattern.factory.abs;

/**
 * 演示抽象工厂
 * 
 * @author 程序猿大头
 * 
 */
public class NorthernFruit implements Fruit {
	private String name;

	public NorthernFruit() {
		super();
	}

	public NorthernFruit(String name) {
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

	@Override
	public void plant() {
		System.out.println("播种" + name + "...");
	}

	@Override
	public void grow() {
		System.out.println(name + "在成长...");
	}

	@Override
	public void harvest() {
		System.out.println("收割" + name + "...");
	}

}
