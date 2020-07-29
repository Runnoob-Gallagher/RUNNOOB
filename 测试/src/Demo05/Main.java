package Demo05;

public class Main {
	public static Animal methodA() {
		//Animal an = new Animal();----这里按照普通类的思想创造对象是错误的，因为是抽象类嘛。那么就去实现他的子类
		Animal an = new Dog();
		return an;
	}
	public static void main(String[] args) {
		Animal an = methodA();
		an.run();
	}
}
