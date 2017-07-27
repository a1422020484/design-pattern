package observation.other1;

import java.util.Vector;

public abstract class Subject {

	private Vector<Observer> obs = new Vector<Observer>();

	public void addObserver(Observer e) {
		this.obs.add(e);
	}

	public void removeObersver(Observer e) {
		this.obs.remove(e);
	};

	public void notifyObserver() {
		for (Observer s : obs) {
			s.update();
		}
	}

	abstract void doSomething();
}
