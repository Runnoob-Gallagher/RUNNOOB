package Package;
//ע��㣺
/*��ʽ��
	�ӿ�����	�������� = new �ӿ�����() {
		��д�ӿ��еĳ��󷽷�
};*/
/*1.�����new����������Ĳ���
2.�ӿ����ƾ��������ڲ�����Ҫʵ�ֵ��ĸ��ӿ�
3.{}���������������ڲ����е�����

һ�������ڲ��ഴ��֮��ֻ��ʹ��һ�Σ������ʹ�ö�Σ���ô��ֻ�ܴ�������ʹ���ˣ�*/
//��������������÷�����ʱ��ֻ��ʹ��һ�Ρ���������ε��õĻ����Ǿ�Ҫȥһ������ȥ���á�����ֻ�ж��ȥ�ظ�֮ǰ�Ĵ���
public class Demo05Main {
	public static void main(String[] args) {
		Demo05Attention demo;
	
		Demo05Attention daA = new Demo05Attention() {

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("���������ڲ��࣬���ǲ�������������Ϊ�һ���Demo05Attention da");
			}
			
		};
		daA.methodA();
		 new Demo05Attention() {//

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				System.out.println("���������ڲ��࣬Ҳ������������Ϊ��û��Demo05Attention da");
			}
			
		}.methodA();
		
	}
}
