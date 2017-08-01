package builder.other1;

/**
 * @author Administrator
 * 建造者模式
 * 核心：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 与工厂的模式不同就是。工厂是将什么都封装好了
 */
public class Client {

	public static void main(String[] args) {
		BuilderModelImpl builderModelImpl = new BuilderModelImpl(new Foreign());
		builderModelImpl.buildPerson();
		Foreign person = (Foreign) builderModelImpl.getPerson();
		System.out.println(person.getPerson().getBody());
	}
}
