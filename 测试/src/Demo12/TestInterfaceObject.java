package Demo12;

public class TestInterfaceObject {
	public static void methodB(TestInterface ti) {
		ti.methodA();
	}
	public static void main(String[] args) {
		methodB(new TestInterface() {
			
			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("��Ȼ��ֱ�ӵ����˽ӿ��еķ��������ǲ���ʹ�õġ���Ҫ���þͱ���ʵ�ֽӿ���д�ӿ��еķ���");
			}
		});
	}
}
