package design_pattern.decorator;

/**
 * 演示装饰器模式: 通过孙悟空72变来讲解
 * 
 * @author 程序猿大头
 * 
 *         对应该模式下的Decorator角色
 */
public class Changer implements Monkey {
	private Monkey monkey;

	public Changer(Monkey monkey) {
		this.monkey = monkey;
	}

	@Override
	public void move() {
		System.out.println("大圣化身移动...");
	}

}
