package command;

public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
		Command command = new ConcreteCommand(receiver);
		invoker.SetCommand(command);
		invoker.ExecuteCommand();
	}

}