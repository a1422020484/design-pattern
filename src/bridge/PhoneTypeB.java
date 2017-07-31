package bridge;

public class PhoneTypeB extends PhoneType{

	public PhoneTypeB(PhoneSoft phoneSoft) {
		super(phoneSoft);
	}

	@Override
	public void Run() {
		phoneSoft.run();
		System.out.println("run phonetypeB");
	}

}
