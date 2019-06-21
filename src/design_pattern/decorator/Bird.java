package design_pattern.decorator;

/**
 * 演示装饰器模式: 通过孙悟空72变来讲解
 * 
 * @author 程序猿大头
 * 
 *         对应该模式下的ConcreteDecorator角色
 */
public class Bird extends Changer {

	public Bird(Monkey monkey) {
		super(monkey);
	}

	@Override
	public void move() {
		super.move();
		sing(); //附加的职责
	}
	
	public void sing() {
		System.out.println("鸟儿会唱歌...");
	}

}
