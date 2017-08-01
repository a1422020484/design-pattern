package flyweight;


public class ConcreteWebSite extends WebSite{

	private String name;
	
	public ConcreteWebSite(String name){
		this.name = name;
	}
	
	@Override
	public void getUser(User user) {
		System.out.println("网站名称：" + name + " 网站用户：" + user.getName());
	}

}
