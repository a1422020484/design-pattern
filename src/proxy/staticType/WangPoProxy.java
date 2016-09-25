package proxy.staticType;

public class WangPoProxy implements KindWoman {

	private KindWoman kindWoman;
	
	public WangPoProxy(KindWoman kindWoman){
		 this.kindWoman = kindWoman;
	}
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		kindWoman.doSomething();
	}

	@Override
	public void sleepTogether() {
		// TODO Auto-generated method stub
		kindWoman.sleepTogether();
	}

}
