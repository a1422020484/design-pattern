package mediator;

/**
 * @author Administrator
 * 中介者模式
 * 
 * 核心就是要有一个中间件，用来传递数据
 * 
 * 中间件类似记忆模式的存储箱，访问者模式
 * 写的比较死
 */
public class Client {

	public static void main(String[] args) {
		Country country1 = new Country1();
		Country country2 = new Country2();
		
		ConcreteManager message = new ConcreteManager();
		message.setCountry1(country1);
		message.setCountry2(country2);
		
		message.sendMessage(country1, "country2 你好");
		message.sendMessage(country2, "country1 你好");
	}

}
