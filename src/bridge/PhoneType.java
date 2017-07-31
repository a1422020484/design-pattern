package bridge;

public abstract class PhoneType {
	public PhoneSoft phoneSoft;

	public PhoneType(PhoneSoft phoneSoft) {
		this.phoneSoft = phoneSoft;
	}
	
	public abstract void Run();
}
