package strategy;

public class ContextMethod {

	private Strategy strategy;

	public ContextMethod(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doMethod() {
		strategy.AlogrithmInterface();
	}
}
