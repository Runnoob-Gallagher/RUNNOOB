package Buffer;

import java.io.Serializable;

public class Person implements Serializable{//����ʵ��Serializable�ӿڣ��൱�ڸ��������һ�����
	/*��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�
	δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л��������л�������������ͱ����ǿ����л��ġ�
	���л��ӿ�û�з������ֶΣ������ڱ�ʶ�����л������塣*/

	/*
	 * ��static���εı������ܱ����л�����Ϊ���л�ֻ����Զ��� ��
	 * transient�ؼ��֣�˲̬�ؼ��֡������εĳ�Ա�������ܱ����л�
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
