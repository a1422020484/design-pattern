package prototype;

public class ShadowClone2Test {

	public static void main(String[] args) {
		ShadowClone2 shadowClone = new ShadowClone2(12, "zhangsan", new int[] { 1, 2, 3 });
		shadowClone.setA(12);
		shadowClone.setB("zhangsan");
		shadowClone.setC(new int[] { 1, 2, 3 });

		System.out.println("克隆前: c1.a=" + shadowClone.getA());
		System.out.println("克隆前: c1.b=" + shadowClone.getB());
		System.out.println("克隆前: c1.c[0]=" + shadowClone.getC()[0]);

		System.out.println("---------------");

		ShadowClone2 shadowClone2 = (ShadowClone2) shadowClone.clone();
		shadowClone2.setA(13);
		shadowClone2.setB("lisi");
		int[] c = shadowClone2.getC();
		c[0] = 4;
		shadowClone2.setC(c);

		System.out.println("克隆后: c1.a=" + shadowClone.getA());
		System.out.println("克隆后: c1.b=" + shadowClone.getB());
		System.out.println("克隆后: c1.c[0]=" + shadowClone.getC()[0]);
		System.out.println("---------------");

		System.out.println("克隆后: c2.a=" + shadowClone2.getA());
		System.out.println("克隆后: c2.b=" + shadowClone2.getB());
		System.out.println("克隆后: c2.c[0]=" + shadowClone2.getC()[0]);

	}

}
