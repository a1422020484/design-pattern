package command;


/**
 * @author Administrator
 * 请求与执行分离
 * 命令--invoker--执行
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤消的操作。
 * 
 * 核心是封装请求作为一个参数
 */
public class Client {

	public static void main(String[] args) {
//		封装一个请求
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.SetCommand(command);
		invoker.ExecuteCommand();
	}

}
