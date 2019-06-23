package design_pattern.decorator;

/**
 * 演示装饰器模式: 通过孙悟空72变来讲解
 * 
 * @author 程序猿大头
 * 
 *         测试类
 */
public class Demo {

	public static void main(String[] args) {
		Monkey monkey = new MonkeySelf();
		Monkey bird = new Bird(monkey);
		bird.move();
		System.out.println("--------Split Line--------");
		Monkey fish = new Fish(bird);
		fish.move();
	}

}
