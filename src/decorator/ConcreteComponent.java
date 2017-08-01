package decorator;

public class ConcreteComponent implements Component{

	public ConcreteComponent(){
		sampleOperation();
	}

	@Override
	public void sampleOperation() {
		System.out.println("我是一个");
	}

}
