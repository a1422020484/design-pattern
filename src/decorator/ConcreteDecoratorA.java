package decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		sampleOperation();
	}

	@Override
	public void sampleOperation() {
		System.out.println("ConcreteDecoratorA");
	}
}
