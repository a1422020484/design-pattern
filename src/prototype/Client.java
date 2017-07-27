package prototype;

import java.util.ArrayList;

/**
 * @author Administrator
 *	 原型模式
 */
class Prototype implements Cloneable {
	protected ArrayList<String> list = new ArrayList<String>();

	public Prototype clone() {
		Prototype prototype = null;
		try {
			// 核心就在clone
			prototype = (Prototype) super.clone();
			// 由于ArrayList不是基本类型，所以成员变量list，不会被拷贝，需要我们自己实现深拷贝，
			prototype.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}

class ConcretePrototype extends Prototype {
	public void show() {
		System.out.println("原型模式的实现类");
	}
	
}

/**
 * @author Administrator
 *	原型模式
 */
public class Client {

	public static void main(String[] args) {
		// 目的是简化对象的创建，clone的时候不会再次调用构造方法
		// 深拷贝与浅拷贝。
		// Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。
		// 如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
			clonecp.show();
		}
	}

}
