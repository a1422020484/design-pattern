package prototype;

public class ShadowClone2 implements Cloneable {
	// 基本类型
	private int a;
	// 非基本类型
	private String b;
	// 非基本类型
	private int[] c;

	public ShadowClone2() {

		this(0, "", new int[0]);
	}

	public ShadowClone2(int a, String b, int[] c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// 重写Object.clone()方法,并把protected改为public
	@Override
	public Object clone() {
		ShadowClone2 sc = null;
		try {
			sc = (ShadowClone2) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sc;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int[] getC() {
		return c;
	}

	public void setC(int[] c) {
		this.c = c;
	}
}
