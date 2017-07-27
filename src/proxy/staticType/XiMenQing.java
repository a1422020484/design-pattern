package proxy.staticType;

/**
 * @author Administrator
 *	静态代理
 */
public class XiMenQing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WangPoProxy wpp = new WangPoProxy(new PanJinLian());
		wpp.doSomething();
		wpp.sleepTogether();
	}

}
