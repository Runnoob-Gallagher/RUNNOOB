package Demo01;
//方法参数传递Person类，实则传递的是Person类型的对象 Person p = new Person();
public class Main {
	public void methodA(Person p) {
		p.eat();
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.methodA(new Person());//----> Person p = new Person();
	}
} 
