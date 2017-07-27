package observation.other1;

/**
 * @author Administrator
 * 核心是 要通知被观察者做一些改变
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
