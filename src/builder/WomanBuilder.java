package builder;

public class WomanBuilder implements PersonBuilder{

	private Person person;
	
	public WomanBuilder(){
		person = new Person();
	}
	
	@Override
	public void buildHead() {
		person.setHead("Woman's head");
	}

	@Override
	public void buildBody() {
		person.setBody("Woman's body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("Woman's foot");
	}

	@Override
	public Person buildPerson() {
		buildHead();
		buildBody();
		buildFoot();
		return person;
	}

}
