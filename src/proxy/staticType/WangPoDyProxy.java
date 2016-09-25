package proxy.staticType;

public class WangPoDyProxy implements KindWoman{

	private KindWoman kindWoman;
	
	public WangPoDyProxy(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		kindWoman = (KindWoman) Class.forName(className).newInstance();
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
