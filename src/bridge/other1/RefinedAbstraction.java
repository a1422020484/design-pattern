package bridge.other1;

public class RefinedAbstraction extends Abstraction {

	private Implementor implementor;

	public RefinedAbstraction(Implementor implementor){
		this.implementor = implementor;
	}

	@Override
	public void operation() {
		implementor.operation();
	}

}
