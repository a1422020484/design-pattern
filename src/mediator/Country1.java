package mediator;

public class Country1 extends Country{

	@Override
	public void getMessage(String message) {
		System.out.println("country1 get message from country2: " + message);
	}

}
