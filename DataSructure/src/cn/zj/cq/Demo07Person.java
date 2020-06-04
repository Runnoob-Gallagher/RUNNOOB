package cn.zj.cq;

public class Demo07Person {
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
	public Demo07Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	/**
	 * 
	 */
	public Demo07Person() {
		
	}
	@Override
	public String toString() {
		return "Demo07PeoPle [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
