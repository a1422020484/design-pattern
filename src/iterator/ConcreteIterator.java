package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator extends InteratorMy {

	private List<Object> list = new ArrayList<Object>();
	private int current = 0;

	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	@Override
	public Object first() {
		return list.get(0);
	}

	@Override
	public Object next() {
		Object object = null;
		if (current < list.size()) {
			object = list.get(current++);
		}
		return object;
	}

	@Override
	public Object currentItem() {
		return list.get(current);
	}

	@Override
	public boolean hasNext() {
		if (current == list.size()) {
			return false;
		}
		return true;
	}

}
