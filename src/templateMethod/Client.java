package templateMethod;

public class Client {
	public static void main(String[] args) {
		Game game1 = new FootBall();
		Game game2 = new BasketBall();

		game1.doSomething();

		game2.doSomething();
	}
}
