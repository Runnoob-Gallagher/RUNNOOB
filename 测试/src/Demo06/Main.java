package Demo06;

public class Main {
	public static Flying methodA() {
		Flying ffB = new Bird();
		return ffB;
	}
	public static void main(String[] args) {
		Flying ff = methodA();//ͬ��  ����methodA���������ص���ʵ����Flying�ӿڵ�ʵ�������
		ff.fly();
	}
}
