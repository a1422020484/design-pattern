package bridge.other1;

/**
 * @author Administrator 跟静态代理好像; 静态代理是new 代理类的实体。这里new的是抽象类的提取
 * 
 *         <p>
 *         将抽象部分与它的实现部分分离，使它们都可以独立地变化。通过对抽象的提取类，来连接实体部分。
 *         </p>
 *         关键点事对抽象的提取
 * 
 *         RefinedAbstraction 为桥接 abstraction 为抽象部分 implementor 为实现部分 桥接模式
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
