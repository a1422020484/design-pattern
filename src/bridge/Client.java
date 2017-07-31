package bridge;


public class Client {

	public static void main(String[] args) {
		PhoneType pt;
		pt = new PhoneTypeA(new PhoneSoftImplA());
		pt.Run();
		System.out.println("=====");
		pt = new PhoneTypeB(new PhoneSoftImplB());
		pt.Run();
		System.out.println("=====");
		pt = new PhoneTypeA(new PhoneSoftImplB());
		pt.Run();
		System.out.println("=====");
		pt = new PhoneTypeB(new PhoneSoftImplA());
		pt.Run();
	}

}
