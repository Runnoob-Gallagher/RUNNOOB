package ReflectKS;
/*
 * ����������ã�һ���ᷢ����ĳ�ʼ����
 * 1.����������������г���ʱ���ȳ�ʼ��main�������ڵ���
 * 2.newһ����Ķ���
 * 3.������ľ�̬��Ա����final�������;�̬����
 * 4.ʹ��java.lang.reflect���÷���������з������
 * 5.����ʼ��һ���࣬�������û�б���ʼ��������ʼ�����ĸ���
 * 
 * ��ı������ã����ᷢ����ĳ�ʼ����
 * 1.������һ����̬��ʱ��ֻ������������������Żᱻ��ʼ�����磺��ͨ���������ø���ľ�̬���������ᵼ�������ʼ��
 * 2.ͨ�����鶨�������ã����ᴥ������ĳ�ʼ��
 * 3.���ó������ᴥ������ĳ�ʼ�������������ӽ׶ξʹ���ĵ�����ĳ������У�
 */
public class Demo05ClassInitial {
	static {
		System.out.println("main�౻���� ");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		//1.����Ӧ��,����������� �� 1��2��3�͵�5��
		//Man ma = new Man();
		/* ִ�н����
		 * main�౻���� 
		   *���౻����
			���౻���� */
		//2.ͨ�����������������
		//Class claA = Class.forName("ReflectKS.Man");
		/*
		 * ִ�н����
		 * main�౻���� 
		 *���౻����
         *���౻����
		 */
		//3.�������������õķ���
	//	System.out.println(Man.grade); //������ø���ľ�̬�����򷽷���������������м���
		/*
		 * ִ�н����
		 * main�౻���� 
         *���౻����
		 */
	//	Man[] arry = new Man[5]; //�����ഴ��������Ҳ���� 
		System.out.println(Man.AGE);// ��������ľ�̬������Ҳ����������༰����
		/*
		 * ���������ӽ׶��Ѿ������˳�����
		 */
	}
	
}
class People{
	static int grade = 12;
	static {
		System.out.println("���౻����");
	}
}
class Man extends People{
	static String sex = "��";
	static {
		System.out.println("���౻����");
		age = 100;
	}
	static int age = 10;
	static final int AGE = 1000;
}
