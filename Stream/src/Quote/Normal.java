 package Quote;

	/*��ô���methodA(System.out::println);
		�⣺System����Java�Զ����һ����
		out��System�����һ����̬���ݳ�Ա��public final static PrintStream out = null;���������Ա��java.io.PrintStream�������    ����������ڲ���ɶ��˼
		println()����java.io.PrintStream�����һ�����������������������̨�����Ϣ��
		System.out.println(s);  ��������ö��󣬶�����÷�����
		�ص�methodA(System.out::println);    ���Ƿ�����Ӧ��   println��������System.out������ô���Ϳ��Ե��ø÷���*/
public class Normal {
	public static void main(String[] args) {
		methodA(new nomalinterface() {
			
			@Override
			public void print(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
		});
		methodA((str) -> System.out.println(str));
		/*
		 * �����lambda���ʽ�����ã�
		 * 	��ӡ����ַ���str
		 * 		1.����System.out�����Ѿ�����
		 * 		2.println����Ҳ�Ѿ�����
		 * �Ϳ���ֱ��ʹ�ö������÷����ķ�ʽ
		 */
		methodA(System.out::println);
		/*Normal nm = new Normal();
		String s =  nm::methodA("�۾ɶ��");
		System.out::methodA("Ss");*/
	}
	public static void methodA(nomalinterface nf) {
		nf.print("�Զ��庯��ʽ�ӿ�");
	}
}
