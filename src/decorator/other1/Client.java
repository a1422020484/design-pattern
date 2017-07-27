package decorator.other1;

public class Client {

	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		
		
//		TheGreatestSage fish = new Fish(new Bird(sage));
		fish.move();
	}

}
