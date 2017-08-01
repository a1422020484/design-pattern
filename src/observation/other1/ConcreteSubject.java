package observation.other1;

public class ConcreteSubject extends Subject{

	@Override
	void doSomething() {
		System.out.println("观察者事件发生");
		this.notifyObserver();
	}

}
