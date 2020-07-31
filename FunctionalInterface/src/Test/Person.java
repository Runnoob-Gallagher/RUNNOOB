package Test;

public class Person {
	String name = "sadada";

	public Person(String name) {
		System.out.println("有参");
		this.name = name;
	}

	public Person() {
		System.out.println("无参");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
