package Demo05;

public class Main {
	public static Animal methodA() {
		//Animal an = new Animal();----���ﰴ����ͨ���˼�봴������Ǵ���ģ���Ϊ�ǳ��������ô��ȥʵ����������
		Animal an = new Dog();
		return an;
	}
	public static void main(String[] args) {
		Animal an = methodA();
		an.run();
	}
}
