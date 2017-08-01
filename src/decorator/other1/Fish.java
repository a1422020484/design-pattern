package decorator.other1;

public class Fish extends Change {

	public Fish(TheGreatestSage sage) {
		super(sage);
		move();
	}

	@Override
	public void move() {
		System.out.println("Fish Move");
	}
}
