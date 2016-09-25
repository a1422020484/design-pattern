package proxy.staticType;

public class XiMenQing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanJinLian pjl = new PanJinLian();
		WangPoProxy wpp = new WangPoProxy(pjl);
		wpp.doSomething();
		wpp.sleepTogether();
	}

}
