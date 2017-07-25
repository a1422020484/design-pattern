package builder.other1;

public class ManPerson extends BuilderModel {

	private Person person;

	public ManPerson() {
		person = new Person();
	}

	@Override
	void getHead() {
		person.setHead("man is head");
	}

	@Override
	void getFood() {
		person.setFoot("man's food");
	}

	@Override
	void getBody() {
		person.setBody("man's body");
	}

	@Override
	Person getPerson() {
		return person;
	}

}
