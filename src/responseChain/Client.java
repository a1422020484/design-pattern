package responseChain;

/**
 * @author Administrator
 * 很类似状态模式
 * 
 * 不同点  状态是交给下一个对象
 * 责任链模式是 交给下一个对象的方法
 * 
 * 由客户端控制链
 */
public class Client {

	public static void main(String[] args) {
		int request = 15;

		Handler handlerA = new HandlerA();
		Handler handlerB = new HandlerB();

		handlerA.setHandler(handlerB);//另一种写法  把set放到父类

		handlerA.handlerRequest(request);
	}
}
