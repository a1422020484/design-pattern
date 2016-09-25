package proxy.staticType;

/**
 * @author Administrator
 *	动态代理方式获得女人
 */
public class XiMenQingDy {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		WangPoDyProxy wpdp = new WangPoDyProxy("proxy.staticType.JiaShi");
		wpdp.doSomething();
		wpdp.sleepTogether();
		
	}

}
