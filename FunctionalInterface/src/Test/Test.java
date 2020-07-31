package Test;

public class Test {
	public static void main(String[] args) {
		Person ppA = new Person("yangjie");
		String name = ppA.getName();
		System.out.println(name);
		ppA.setName("ssss");
		String nameA = ppA.getName();	 
		System.out.println(nameA);
		Person ppB = new Person();
		ppB.setName("asdasd");
		System.out.println(ppB.getName());
	}
}
