package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Administrator 深克隆例子
 */
public class DeepClone {

	public static void main(String[] args) throws Exception {
		Person person1 = new Person("yang",10,"1111");
		DeepClone deepClone = new DeepClone();
		Person person2 = (Person) deepClone.deepClone(person1);

		System.out.println(person1.getTeacher() == person2.getTeacher());
		System.out.println(person1.getAge() + " " + person1.getName() + " " + person1.getTeacher().getName());
		System.out.println(person2.getAge() + " " + person2.getName() + " " + person2.getTeacher().getName());
	}

	public Object deepClone(Object obj) throws Exception {
		Object o = null;
		if (obj != null) {
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(obj);

				ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bais);
				o = ois.readObject();
				oos.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return o;
	}
}

class Teacher implements Serializable{
	private String name;
	public Teacher(String name){
		this.name = name;
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

}

class Person implements Serializable {
	private String name;
	private int age;
	private Teacher teacher;

	Person(String name,int age,String teacherName){
		this.name = name;
		this.age = age;
		this.teacher = new Teacher(teacherName);
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

	/**
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
