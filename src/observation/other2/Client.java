package observation.other2;

/**
 * @author Administrator
 * 委托模式  待探究的
 */
public class Client {

	public static void main(String[] args) {
		ModelObserver1 modelObserver1 = new ModelObserver1();
		ModelObserver2 modelObserver2 = new ModelObserver2();
		Subject subject = new ConcreteSubject();
		subject.addObserver(modelObserver1);
		subject.addObserver(modelObserver2);
		subject.doSomething();
	}

}
