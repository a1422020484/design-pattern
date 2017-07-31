package bridge;

public class PhoneTypeA extends PhoneType{

	public PhoneTypeA(PhoneSoft phoneSoft) {
		super(phoneSoft);
	}

	@Override
	public void Run() {
		phoneSoft.run();
		System.out.println("PhoneTypeA run");
	}

}
