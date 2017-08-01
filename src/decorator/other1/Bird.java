package decorator.other1;

public class Bird extends Change {
	
	public Bird(TheGreatestSage sage) {
		super(sage);
		move();
	}

	@Override
	public void move() {
		System.out.println("Bird Move");
	}
}
