package builder.other1;

public class Foreign extends BuilderModel {

	private Person person;

	Foreign(){
		person = new Person();
	}
	
	@Override
	void setHead() {
		person.setHead("foreign is head");
	}

	@Override
	void setFood() {
		person.setFoot("foreign is food");
	}

	@Override
	void setBody() {
		person.setBody("foreign is body");
	}

	@Override
	Person getPerson() {
		return person;
	}

	
}
