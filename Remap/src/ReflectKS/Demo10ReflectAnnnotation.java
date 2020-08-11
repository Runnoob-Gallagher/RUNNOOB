package ReflectKS;

public class Demo10ReflectAnnnotation {
	
}

class Person{
	private String name = "Gallagher";
	private int age = 24;
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
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	public void methodA() {
		System.out.println("我就是一个普通方法");
	}
}