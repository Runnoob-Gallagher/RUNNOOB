package cn.zi.cq02;
//���demo����Ϥ���з��͵ķ���
/*��ʽ��
���η� <����> ����ֵ���� ������(�����б�(ʹ�÷���)) {  //�������ͱ����ڷ���ֵ����ǰ��
	������;
}*/
//��֮ǰ���з��͵���һ����֮ǰ���ڴ�������ʱ��ȷ�����͵����ͣ�������ڵ��÷���ʱ��ȷ�����͵�����
public class Demo03FanXinMethod {
	public  <M> void methodA(M m) {
		System.out.println(m);
	}
	//����һ��ָ�����͵ķ��� 
	public <String> void methodC(String str) {
		System.out.println(str);
	}
	public static <S> void methodB(S s) {
		System.out.println(s);
	}
}
