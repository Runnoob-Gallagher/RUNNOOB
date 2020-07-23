package Buffer;

import java.io.Serializable;

public class Person implements Serializable{//必须实现Serializable接口，相当于给这个类做一个标记
	/*类通过实现 java.io.Serializable 接口以启用其序列化功能。
	未实现此接口的类将无法使其任何状态序列化或反序列化。可序列化类的所有子类型本身都是可序列化的。
	序列化接口没有方法或字段，仅用于标识可序列化的语义。*/

	/*
	 * 被static修饰的变量不能被序列化，因为序列化只是针对对象 】
	 * transient关键字：瞬态关键字。被修饰的成员变量不能被序列化
	 */
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * 
	 */
	public Person() {
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
