package command;


/**
 * @author Administrator
 * 命令与执行分离
 * 命令--invoker--执行
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
		Command command = new ConcreteCommand(receiver);
		invoker.SetCommand(command);
		invoker.ExecuteCommand();
	}

}
