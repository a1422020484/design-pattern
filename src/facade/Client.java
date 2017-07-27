package facade;

/**
 * @author yang
 * 怎么都感觉这个设计模式没什么意思，和建造者模式有点像
 * 
 * 核心就是  方法组
 * 依赖倒转和迪米特法则的思想
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeMethod fb = new FacadeMethod();
		fb.openFile();
		
	}

}
