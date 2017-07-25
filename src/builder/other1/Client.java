package builder.other1;

public class Client {

	public static void main(String[] args) {
//		ManPerson manPerson = new ManPerson();
		
//		manPerson.buildPerson();
//		Person person = manPerson.getPerson();
//		System.out.println(person.getHead() + "," + person.getBody() + "," + person.getFoot());
		
		BuilderModel builderModel = BuilderModel.getPersonModel(new Foreign());
		builderModel.buildPerson();
		Person person = builderModel.getPerson();
		System.out.println(person.getHead() + "," + person.getBody() + "," + person.getFoot());
	}

}
