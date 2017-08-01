package visitor;

/**
 * @author Administrator
 * 局限性比较大
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.Attach(new ConcreteElementA());
		objectStructure.Attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		objectStructure.Accept(v1);
		objectStructure.Accept(v2);
	}

}
