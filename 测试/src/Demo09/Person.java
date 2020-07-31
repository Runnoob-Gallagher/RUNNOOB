package Demo09;

public class Person {
	String name;
	int age;
	/**
	 * 
	 */
	public Person() {
		super();
		System.out.println("如果打印到这，说明调用了无参构造方法");
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("如果打印到这，说明调用了有参构造方法");
	}
	public String getName() {
		return name;
	}

	
	  public void setName(String name) { this.name = name; }
	 
	public int getAge() {
		return age;
	}
	
	  public void setAge(int age) { this.age = age; }
	 

}
