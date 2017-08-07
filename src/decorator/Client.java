package decorator;

/**
 * @author Administrator
 * 装饰模式
 * 动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更灵活
 * 
 * 核心就是不用继承的方式来为类添加新的方法
 */
public class Client {

	public static void main(String[] args) {
//		不能这么写
//		Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
		Component component1 = new ConcreteComponent();
		Component component2 = new ConcreteDecoratorA(component1);
		Component component3 = new ConcreteDecoratorB(component2);
		
//		component1.sampleOperation();
	}

}
