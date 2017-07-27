package decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void sampleOperation() {
		super.sampleOperation();
		doOtherSomething();
	}
	
	public void doOtherSomething(){
		System.out.println("ConcreteDecoratorA");
	}
}
