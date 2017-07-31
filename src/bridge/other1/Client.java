package bridge.other1;

/**
 * @author Administrator 跟静态代理好像
 * 桥接模式
 */
public class Client {

	public static void main(String[] args) {
		Abstraction ab1 = new RefinedAbstraction(new ConcreteImplementorA());
		ab1.operation();
		System.out.println("======");
		Abstraction ab2 = new RefinedAbstraction(new ConcreteImplementorB());
		ab2.operation();
	}

}
