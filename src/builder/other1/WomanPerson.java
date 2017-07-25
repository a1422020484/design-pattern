package builder.other1;

public class WomanPerson extends BuilderModel {

	private Person person;

	WomanPerson() {
		person = new Person();
	}

	@Override
	void getHead() {
		person.setHead("woman is head");
	}

	@Override
	void getFood() {
		person.setFoot("woman's food");
	}

	@Override
	void getBody() {
		person.setBody("woman's body");
	}

	@Override
	Person getPerson() {
		return person;
	}

}
