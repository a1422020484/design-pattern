package builder.other1;

public class WomanPerson extends BuilderModel {

	private Person person;

	WomanPerson() {
		person = new Person();
	}

	@Override
	void setHead() {
		person.setHead("woman is head");
	}

	@Override
	void setFood() {
		person.setFoot("woman's food");
	}

	@Override
	void setBody() {
		person.setBody("woman's body");
	}

	@Override
	Person getPerson() {
		return person;
	}

}
