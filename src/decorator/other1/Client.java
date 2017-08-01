package decorator.other1;

/**
 * @author Administrator
 * 目的是为了增加新的功能
 */
public class Client {

	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		
		
//		TheGreatestSage sage = new Fish(new Bird(new Monkey()));
		sage.move();
	}

}
