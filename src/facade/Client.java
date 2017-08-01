package facade;

/**
 * @author yang
 * 怎么都感觉这个设计模式没什么意思，和建造者模式有点像
 * 
 * 外观模式
 * 
 * 核心就是  方法组
 * 依赖倒转和迪米特法则的思想
 * 类的创建和声明分开。
 * 
 * 1、分层表现层
 * 2、提供简单接口，减少他们之间的依赖
 * 3、提供复杂代码的一个简单接口，让新系统与Facade来交互。
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeMethod fb = new FacadeMethod();
		fb.openFile();
		
	}

}
