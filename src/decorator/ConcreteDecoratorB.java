package decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void sampleOperation() {
		super.sampleOperation();
		doOtherSomething();
	}
	
	public void doOtherSomething(){
		System.out.println("ConcreteDecoratorB");
	}
}
