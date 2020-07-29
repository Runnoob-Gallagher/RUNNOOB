package Demo04;

public class Main {
	public static Person methodA() {
		Person p = new Person();
		return p;
	}
	public static void main(String[] args) {
		Person p = methodA(); //这个就相当于Person p = new Person();  只不过用方法返回了，也就是返回了Person类的对象
		p.eat();
	}
}
