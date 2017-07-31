package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

	private List<Object> itemLists = new ArrayList<Object>();

	@Override
	public InteratorMy createIterator() {
		return new ConcreteIterator(itemLists);
	}

	@Override
	public void add(Object e) {
		itemLists.add(e);
	}

	@Override
	public void remove(Object e) {
		itemLists.remove(e);
	}

}
