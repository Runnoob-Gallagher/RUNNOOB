package cn.zj.cq;
//���demo����Ϥ�Զ����쳣��
/*	��ʽ��
		public class XXXException extends Exception / RuntimeException{
			���һ���ղ����Ĺ��췽��
			���һ���������Ĺ��췽��
	}
	ע�⣺
		�Զ����쳣��һ������Exception��β��˵��������һ���쳣��
			�̳�Exception����ô�Զ�����쳣�����һ���������쳣����������ڲ��׳�����������쳣����Ҫȥ��������Ҫôtry��throws
			�̳�RuntimeException:��ô����һ���������쳣�����账����java�������*/
public class RegisterException extends Exception {
		public  RegisterException () {
			super();
		}
		public RegisterException (String s ){
			super(s);
		}
}
