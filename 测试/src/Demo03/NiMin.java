package Demo03;

public class NiMin {
	public static void methodA(Flying f) {
		f.fly();
	}
	public static void main(String[] args) {
		methodA(new Flying() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���" + "  " + "�����ó���ڷ�");
			}
		});
		methodA(new Flying() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���" + "  " + "������ȼ���ڷ�");
			}
		});
		
	}
}
