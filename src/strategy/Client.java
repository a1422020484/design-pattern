package strategy;

/**
 * @author Administrator
 * 定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户
 * 
 * 策略模式也可以与简单工厂模式相结合
 * 
 * 策略模式封装了变化
 * 
 * 工厂方法和策略模式的区别：
 * 
 * 工厂方法通过反射返回一个产品对象簇
 * 策略只是封装方法的变化
 */
public class Client {

	public static void main(String[] args) {
		ContextMethod contextMethodA = new ContextMethod(new MethodA());
		contextMethodA.doMethod();
		ContextMethod contextMethodB = new ContextMethod(new MethodB());
		contextMethodB.doMethod();
		ContextMethod contextMethodC = new ContextMethod(new MethodC());
		contextMethodC.doMethod();
	}

}
