package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepClone2Test {

	public static void main(String[] args) {
		DeepClone2Test test = new DeepClone2Test();

		DeepClone2 shadowClone = new DeepClone2();
		shadowClone.setA(12);
		shadowClone.setB("zhangsan");
		shadowClone.setC(new int[] { 1, 2, 3 });

		System.out.println("克隆前: c1.a=" + shadowClone.getA());
		System.out.println("克隆前: c1.b=" + shadowClone.getB());
		System.out.println("克隆前: c1.c[0]=" + shadowClone.getC()[0]);
		System.out.println("---------------");
		// 调用深拷贝方法
		DeepClone2 shadowClone2 = (DeepClone2) test.deepClone(shadowClone);
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

	// 用序列化与反序列化实现深克隆
	public Object deepClone(Object src) {
		Object o = null;
		if (src != null) {
			try {
				// 采用 输出流对象转换成到字节流
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(src);
				oos.close();

				// 运行对象的字节流反序列化生成对象
				ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bais);
				o = ois.readObject();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return o;

	}
}
