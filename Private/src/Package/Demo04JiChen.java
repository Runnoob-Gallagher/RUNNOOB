package Package;
//����Ǽ̳���ʹ�������ڲ���
/*��ʽ��
	�������� ������ = new ��������{
		��д����ķ���
}*/
public class Demo04JiChen {
	public void methodB() {
		System.out.println("����");
	}
	public static void main(String[] args) {
		Demo04NiMin dnm = new Demo04NiMin() {
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("����");
			}
		};
		dnm.methodA();
	}
	
}
