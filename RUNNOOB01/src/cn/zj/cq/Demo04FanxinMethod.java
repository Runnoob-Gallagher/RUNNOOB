package cn.zj.cq;
//���庬�з��͵ķ���
/*��ʽ��
	���η� <����> ����ֵ���� ������(�����б�(��������)) {
		������;
	}
	�ٽ��з������õ�ʱ�򣬸��ݴ���Ĳ���������ȷ����������*/
public class Demo04FanxinMethod {
	public <E> void method(E e) {
		System.out.println(e);
	}
	
	//���庬�з��͵ľ�̬����
	public static <M> void jump(M m) {
		System.out.println(m);
	}
} 
