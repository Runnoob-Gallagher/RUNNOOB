package Demo01;
//������������Person�࣬ʵ�򴫵ݵ���Person���͵Ķ��� Person p = new Person();
public class Main {
	public void methodA(Person p) {
		p.eat();
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.methodA(new Person());//----> Person p = new Person();
	}
} 
