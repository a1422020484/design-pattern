package bridge.other1;

public abstract class Abstraction {

	private Implementor implementor;
	private Implementor2 implementor2;

	public abstract void operation();

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public Implementor2 getImplementor2() {
		return implementor2;
	}

	public void setImplementor2(Implementor2 implementor2) {
		this.implementor2 = implementor2;
	}
}
