package builder.other1;

public class Foreign extends BuilderModel {

	private Person person;

	Foreign(){
		person = new Person();
	}
	
	@Override
	void getHead() {
		person.setHead("foreign is head");
	}

	@Override
	void getFood() {
		person.setFoot("foreign is food");
	}

	@Override
	void getBody() {
		person.setBody("foreign is body");
	}

	@Override
	Person getPerson() {
		return person;
	}

}
