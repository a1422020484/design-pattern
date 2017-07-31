package iterator;

public abstract class Aggregate {
	public abstract InteratorMy createIterator();
	public abstract void add(Object e);
	public abstract void remove(Object e);
}
