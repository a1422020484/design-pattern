package iterator;

public class ConcreteIterator extends InteratorMy {

	private ConcreteAggregate[] concreteAggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate[] concreteAggregate) {
		this.concreteAggregate = concreteAggregate;
	}

	@Override
	public Object First() {
		return concreteAggregate[0];
	}

	@Override
	public Object Next() {
		Object object = null;
		current++;
		if (current < concreteAggregate.length) {
			object = concreteAggregate[current];
		}
		return object;
	}

	@Override
	public boolean IsDone() {
		return current >= concreteAggregate.length ? true : false;
	}

	@Override
	public Object CurrentItem() {
		return concreteAggregate[current];
	}

}
