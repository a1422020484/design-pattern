package adapter;

/**
 * @author yangxp
 * @date 2017年8月7日 上午10:00:17
 *       <p>
 *       适配器模式。 也可以说是继承和重写的使用。
 *       <p>
 *       核心:其实都是实现同样的接口,类的转换，A到C，中间必须要一个适配器B作为中间这来继承
 *       A extends B  ; B implements C ;因为B可能适配很多个接口，所以要实现接口
 */
public class Client {

	public static void main(String[] args) {
		// 适配后的类
		Target adp = new Adapter();
		// 原生的类
//		Target adp2 = new ConcreteMethod();
		adp.request();
//		adp2.request();
	}

}
