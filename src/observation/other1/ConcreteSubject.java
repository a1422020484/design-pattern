package observation.other1;

public class ConcreteSubject extends Subject{

	@Override
	void doSomething() {
		System.out.println("观察者时间发生");
		this.notifyObserver();
	}

}
