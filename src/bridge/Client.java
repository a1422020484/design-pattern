package bridge;


/**
 * @author Administrator
 * 合成和聚合
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 */
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
