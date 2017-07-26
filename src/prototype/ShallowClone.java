package prototype;

/**
 * @author Administrator 一个浅复制的例子 复制引用而不是引用所指向的值
 */
public class ShallowClone {

	public static void main(String[] args) {
		Student s1 = new Student("zhangsan", 20);
		Student s2 = (Student) s1.clone();
		s1.setAge(30);
		s1.setName("李四");
		System.out.println(s1.getAge() + " " + s2.getAge());
		System.out.println(s1.getName() + " " + s2.getName());
	}

}

class Student implements Cloneable {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
