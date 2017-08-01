package flyweight;

/**
 * @author Administrator
 * 享元模式  共享对象
 */
public class Client {
	
	public static void main(String[] args) {
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		WebSite webSite1 = webSiteFactory.getWebSite("生物教程");
		webSite1.getUser(new User("小菜"));
		WebSite webSite2 = webSiteFactory.getWebSite("驾驶视频");
		webSite2.getUser(new User("小菜"));
		
		System.out.println(webSiteFactory.getTable().size());
		
	}
}
