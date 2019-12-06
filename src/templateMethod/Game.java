package templateMethod;

public abstract class Game {
	public abstract void endPlay();

	public abstract void initialize();

	public abstract void startPlayer();

	public void doSomething() {
		endPlay();
		initialize();
		startPlayer();
	}
}
