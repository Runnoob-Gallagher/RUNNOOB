package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collections;

//���demo��˵��java.utils.collections�ķ���---->�Ǽ��Ϲ����࣬�����Լ��Ͻ��в���
/*������ 
public static <T> boolean addAll(Collection<T> c, T... elements):���������һЩԪ�ء�
public static void shuffle(List<?> list)����˳�򣺴��Ҽ���˳��
public static <T> void sort (List<T> list) :�������е�Ԫ����Ĭ������
public static <T> void sort(List<T> list,Com parator<? super T>):������Ԫ�ذ�ָ����������*/
public class Demo10Coolections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("��");
		list.add("ɭ��");
		list.add("����");
		System.out.println(list);
		Collections.addAll(list, "����","Ů��");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//Collections.sort(list, c);
	}
}
