package Demo08;

public class Person {
	String name;
	int age;
	/**
	 * 
	 */
	public Person() {
		System.out.println("这里调用的是无参构造方法");
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		System.out.println("这里调用的是有参构造方法");
		this.name = name;
		this.age = age;
	}
	
}
