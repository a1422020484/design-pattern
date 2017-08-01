package visitor;

public class ConcreteVisitor1 extends Visitor {

	@Override
	public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + " 访问了：" + this.getClass().getName());
	}

	@Override
	public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + " 访问了：" + this.getClass().getName());
	}

}
