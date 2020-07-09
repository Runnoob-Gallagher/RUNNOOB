package �����ڲ���;
//���demo��������������е�
public class StaticInner {
	private String nameA = "�Ǿ�̬�ⲿ����A";
	private void methodOutA() {
		System.out.println("�Ǿ�̬�ⲿ�෽��A");
	}
	private static String nameB = "������̬�ⲿ����B";
	private static void methodOutB() {
		System.out.println("������̬�ⲿ�෽��B");
	}
	private  String nameC = "�Ǿ�̬�ⲿ����C";
	private  void methodOutC() {
		System.out.println("�Ǿ�̬�ⲿ�෽��C");
	}
	//�㿴��ߵı�����nameB��methodB����һ�µĵ���û�г�ͻ���ǲ���˵���˾�̬�ڲ�����ⲿ���޹�
	private static class Inner{
		private static String nameB = "������̬�ڲ�����B";
		private static void methodOutB() {
			System.out.println("������̬�ڲ��෽��B");
		}
		private String nameD = "��̬�ڲ���D";
		private void methodInD() {
			System.out.println("��̬�ڲ�������D");
		}
		private static String nameC = "��̬�ڲ�����C";
		private static void methodOutC() {
			System.out.println("��̬�ڲ��෽��C");
		}
		
	}
	//Inner in = new Inner();
	public static void main(String[] args) {
		Inner inA = new Inner();//���ʱ��ͨ�ڲ��࣬�������̬�������д�����ͨ�����ǻᱨ��� //������̬�ڲ���ĵ�һ�ַ�ʽ
		System.out.println(inA.nameD + "  " + inA.nameC );//������ʵ�ʱ
		StaticInner.Inner inB = new StaticInner.Inner();//������̬�ڲ���ĵڶ��ַ�ʽ
		System.out.println(inB.nameD + "  " + inB.nameC);
		//Inner inC = new StaticInner().new Inner();//����Illegal enclosing instance specification for type StaticInner.Inner
		//����ı�������Ϊʹ����֮ǰ�Ǿ�̬�ڲ���ķ���ȥ���������൱�ڰ����ⲿ�࣬���Ǻ;�̬�ڲ��಻���ģ�����������
		//System.out.println(inC.nameA + inC.nameB);
		inA.methodInD();
		inB.methodInD();
		//inC.methodInA();
		
		
		//System.out.println(inA.nameA);���ﾲ̬�ڲ�������ⲿ��Ǿ�̬�ͱ�����
		System.out.println(StaticInner.Inner.nameB);  //���ʱֱ��ͨ���ⲿ��.�ڲ���.����(����)ȥ���������ڲ���Ķ���
		StaticInner si = new StaticInner();//���ʱ�ⲿ��Ķ���
		System.out.println(si.nameB); //�����ⲿ��Ķ����ܷ��ʾ�̬�ڲ�����κα���
	}
}
