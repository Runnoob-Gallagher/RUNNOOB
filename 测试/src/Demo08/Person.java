package Demo08;

public class Person {
	String name;
	int age;
	/**
	 * 
	 */
	public Person() {
		System.out.println("������õ����޲ι��췽��");
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		System.out.println("������õ����вι��췽��");
		this.name = name;
		this.age = age;
	}
	
}
