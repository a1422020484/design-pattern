package bridge.other1;

/**
 * @author Administrator 跟静态代理好像; 静态代理是new代理类的实体。这里new的是抽象类的操作的提取。代理模式的代理类和实现类的接口是统一的。
 * 桥接的是不一样的。
 * 核心：对操作的提取，多维度降低维度。脾气和爱好。
 * 
 *         <p>
 *         将抽象部分与它的实现部分分离，使它们都可以独立地变化。通过对抽象的提取类，来连接实体部分。 关键点：对抽象的提取
 *         ConcreteImplementA and ConcreteImplementA and Implementor 为一个整体；
 *         Abstraction and RefinedAbstraction 为一个整体 ； RefinedAbstraction 为桥接
 *         abstraction 为抽象部分 implementor 为实现部分桥接模式。
 *         <ul>
 *         <li>
 *         代理模式：在调用者和被调用者之间加一个间接层来控制对象间的访问，代理和被调用对象实现相同的接口，通过间接层可以做缓存，安全控制，
 *         预处理等等一系列操作
 *         ，但是有一个点必须记住，就是代理类和被调用类要实现统一的这接口，这样对于客户来说，你的间接层对他就是不可见的，客户不需要知道你做了代理
 *         ，他只需要你给他提供服务的接口不变即可。
 *         <li>
 *         桥接模式：也是组合模式中最常用的，用来分离抽象和行为，让抽象和行为能各自单独的变化。引申为如果一个类面临着几个方面的变化，
 *         我们将各个方面的变化抽离出来
 *         ，定义成接口，然后再把接口组合成一个类来实现原有的功能，这里体现面向对象的两个原则（接口隔离原则、优先使用对象组合然后考虑继承）。
 *         </ul>
 *         <p>
 *         桥接模式可以这样来做类比，比如说人这个类，每个人都是人类的一个子类，但是每个人的行为却又不一样，如果把所有的行为都定义在人这个类里面，
 *         那么很多很多的人就会有很多很多的子类
 *         ，如果我们把行为抽离出来，比如说现在有2个维度：脾气和爱好，有的人脾气好，有的人脾气坏，有的人喜欢看书，
 *         有的人喜欢看电视，如果我们把脾气和爱好作为一个类来抽象
 *         ，就会产生4个子类，而且每个子类里面两个行为，如果我们把脾气和爱好抽离，就会发现，只需写两组子类
 *         ，每个子类里面一个行为，然后这样组合，更急灵活，如果按照原始的方式，那么
 *         子类的的数目会随着每个维度行为的变化倍数的增长，抽离和能减少子类，并且采用组合方式更能灵活的切换对象的行为，而不用生成新的子类。
 * 
 *         http://blog.csdn.net/see__you__again/article/details/51996797
 */
public class Client {

	public static void main(String[] args) {
		Abstraction ab1 = new RefinedAbstraction();
		ab1.setImplementor(new ConcreteImplementorA());
		ab1.setImplementor2(new Implementor2ImplA());
		ab1.operation();
		System.out.println("=======");
		Abstraction ab2 = new RefinedAbstraction();
		ab2.setImplementor(new ConcreteImplementorB());
		ab2.setImplementor2(new Implementor2ImplA());
		ab2.operation();
		System.out.println("=======");
	}

}
