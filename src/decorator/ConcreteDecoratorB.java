package decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
		sampleOperation();
	}

	@Override
	public void sampleOperation() {
		System.out.println("ConcreteDecoratorB");
	}
}
