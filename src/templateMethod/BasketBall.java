package templateMethod;

public class BasketBall extends Game {

	@Override
	public void endPlay() {
		System.out.println("BasketBall endPlayer");
	}

	@Override
	public void initialize() {
		System.out.println("BasketBall initialize");
	}

	@Override
	public void startPlayer() {
		System.out.println("BasketBall startPlayer");
	}

}
