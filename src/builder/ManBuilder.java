package builder;

/**
 * @author Administrator
 * 建造人的流程
 */
public class ManBuilder implements PersonBuilder {

	Person person;
	public ManBuilder(){
		person = new Person();
	}
	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		
		buildHead();
		buildBody();
		buildFoot();
		return person;
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("创建女人头");
	}
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("创建女人胸");
	}
	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("创建女屁股");
	}
	
	
}
