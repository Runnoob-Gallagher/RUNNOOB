package Demo04;

public class Main {
	public static Person methodA() {
		Person p = new Person();
		return p;
	}
	public static void main(String[] args) {
		Person p = methodA(); //������൱��Person p = new Person();  ֻ�����÷��������ˣ�Ҳ���Ƿ�����Person��Ķ���
		p.eat();
	}
}
