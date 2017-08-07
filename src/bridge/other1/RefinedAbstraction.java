package bridge.other1;

public class RefinedAbstraction extends Abstraction {

	@Override
	public void operation() {
		getImplementor().operation();
		getImplementor2().operation2();
	}

}
