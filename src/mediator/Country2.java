package mediator;

public class Country2 extends Country {

	@Override
	public void getMessage(String message) {
		System.out.println("country2 get message from country1: " + message);
	}

}
