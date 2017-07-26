package builder.other1;

/**
 * @author Administrator
 * 建造者模式
 * 核心：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 与工厂的模式不同就是。工厂是将什么都封装好了
 */
public abstract class BuilderModel {
	abstract void setHead();

	abstract void setFood();

	abstract void setBody();

	abstract Person getPerson();

	
}
