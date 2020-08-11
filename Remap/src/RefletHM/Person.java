package RefletHM;

public class Person {
	private String name;
	private int age;
	public int grade;
	public String Sex;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public Person(String name, int age, int grade, String sex) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		Sex = sex;
	}
	public Person() {
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", grade=" + grade
				+ ", Sex=" + Sex + "]";
	}
	
	
}
