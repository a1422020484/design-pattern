package mediator;

public class ConcreteManager extends Manager {

	private Country country1;
	private Country country2;

	public void sendMessage(Country country, String message) {
		if (country == country1) {
			country2.getMessage(message);
		} else {
			country1.getMessage(message);
		}
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public void setCountry2(Country country2) {
		this.country2 = country2;
	}

}
