package ReflectKS;
/*
 * ͨ�������������ô���ص�
 * 1.��class�ļ��ֽ�����ص��ڴ��У�������Щ��̬����ת���ɷ���ȥ�������ǽṹ��Ȼ������һ������������java.lang.Class����
 * 2.���ӣ����ӽ����� age = 0��
 * 3.��ʼ��
 * 			<clinit>(){
 * 			sout("Classloader��ľ�̬�����")
 * 			int age = 24;
 * 			static int age = 5;   ������һ����صģ����5����24	
 * }   ע�������CLass�������ڼ��ص�ʱ��Ͳ����ˣ��ڵ�һ��
 */
public class Demo04ClassLoader {
	public static void main(String[] args) {
		Classloader cl = new Classloader();
		System.out.println(cl.age);
	}
}

class Classloader{
	static {
		System.out.println("Classloader��ľ�̬�����");
		int age = 24;
	}
	static int age = 5;
	public Classloader() {
		System.out.println("ClassLoader���޲ι����� ");
	}
}