package design_pattern.decorator;

/**
 * 演示装饰器模式: 通过孙悟空72变来讲解
 * 
 * @author 程序猿大头
 * 
 *         对应该模式下的ConcreteDecorator角色
 */
public class Fish extends Changer {

	public Fish(Monkey monkey) {
		super(monkey);
	}

	@Override
	public void move() {
		super.move();
		jump(); // 附加的职责
	}

	public void jump() {
		System.out.println("鱼儿可以跳龙门...");
	}

}
