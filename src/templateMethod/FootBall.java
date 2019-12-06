package templateMethod;

public class FootBall extends Game {

	@Override
	public void endPlay() {
		System.out.println("football endPlayer");
	}

	@Override
	public void initialize() {
		System.out.println("football initialize");
	}

	@Override
	public void startPlayer() {
		System.out.println("football startPlayer");
	}

}
