package builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManBuilder mb = new ManBuilder();
		Person p = mb.buildPerson();
		System.out.println(p.getBody()+","+p.getFoot()+","+p.getHead());
	}

}
