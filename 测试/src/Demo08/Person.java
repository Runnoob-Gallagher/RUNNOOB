package Demo08;

public class Person {
	String name;
	int age;
	public void meyhodA() {
		System.out.println("hhhh");
	}
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
