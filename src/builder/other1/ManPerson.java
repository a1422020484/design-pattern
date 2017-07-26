package builder.other1;

public class ManPerson extends BuilderModel {

	private Person person;

	public ManPerson() {
		person = new Person();
	}

	@Override
	void setHead() {
		person.setHead("man is head");
	}

	@Override
	void setFood() {
		person.setFoot("man's food");
	}

	@Override
	void setBody() {
		person.setBody("man's body");
	}

	@Override
	Person getPerson() {
		return person;
	}

}
