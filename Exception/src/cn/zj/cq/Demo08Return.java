package cn.zj.cq;
//���demo����֤return���쳣�е�Ӱ��,���finally�������return����ô����϶���Ҫִ�еģ�  ��ñ���
public class Demo08Return {
	public static void main(String[] args) {
	System.out.println(methodA(0));
	System.out.println(methodA(4));//������������������������֣�������finally��ִ����return��ֵ�ͻᱻ����Ϊreturn�е�
	}
	public static int methodA(int b) {
		int a = 6;
		try{
			int result = a/b;
		}catch(Exception e) { 
			e.printStackTrace();
		}finally {
			return 6;
		}
		
	}
} 
