package Test;

public class Person {
	String name = "sadada";

	public Person(String name) {
		System.out.println("�в�");
		this.name = name;
	}

	public Person() {
		System.out.println("�޲�");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
