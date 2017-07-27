package decorator;

/**
 * @author Administrator
 * 动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更灵活
 */
public class Client {

	public static void main(String[] args) {
		Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
		component.sampleOperation();
	}

}
