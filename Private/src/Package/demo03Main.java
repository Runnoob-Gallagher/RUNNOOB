package Package;
//����ӿ��е�ʵ����͸����е�����ֻ����һ�Σ���ô�Ϳ���ʹ�������ڲ��� 
/*��ʽ��
	�ӿ����� ������ = new �ӿ�����() {
		��д�ӿ��еĳ��󷽷�
};*/
public class demo03Main {
	public static void main(String[] args) {
		/*
		 * Demo03 dmA = new Demo03(); dmA.methodA(); Demo03NiMing dmB = new
		 * Demo03();//����Ƕ�̬�������� dmB.methodA();
		 *///����֮ǰ����ͨ�Ĳ���������ͨ��������ã�ͨ����̬����
		Demo03NiMing dnm = new Demo03NiMing() {

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ����еķ���");
			}
		};
		dnm.methodA();
		/*
		 * {
		 * 
		 * @Override public void methodA() { // TODO Auto-generated method stub
		 * System.out.println("�����ڲ����еķ���"); } };
		 */  //ע�⣡����������һ���־��������ڲ���
}
}
