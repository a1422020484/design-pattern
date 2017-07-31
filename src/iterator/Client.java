package iterator;

/**
 * @author Administrator
 * 迭代器模式
 * 访问一个聚集对象
 * 类似 for 
 */
public class Client {
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("yang");
		aggregate.add("liu");
		aggregate.add("famg");
		InteratorMy interatorMy = aggregate.createIterator();
		System.out.println(interatorMy.first());
		while (interatorMy.hasNext()) {
			System.out.println(interatorMy.next());
		}
	}
}
