package Demo03;

public class Main {
	public static void methodA(Flying f) {//���������д��ݵ��ǽӿ����ͣ�������������������൱�ڴ��ݵ��ǽӿڵ�ʵ�������
		f.fly();
	}
	public static void main(String[] args) {
		Main main = new Main();
		methodA(new Bird() {	
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println( "�����ó���ڷ�");
			}
		});
		methodA(new AirPlane() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println( "������ȼ���ڷ�");
			}
		});
	}
}
