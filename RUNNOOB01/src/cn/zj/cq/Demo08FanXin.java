package cn.zj.cq;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo08FanXin {
	public static void main(String[] args) {
		ArrayList<String> strA = new ArrayList<String>();
		strA.add("����ͨ���");
		strA.add("���ܴ�������ʹ��");
		strA.add("ֻ����Ϊ��������ʹ��");
		ArrayList<Integer> strB = new ArrayList<Integer>();
		strB.add(777);
		strB.add(888);
		//��������ʹ�÷�����ArrayList�����еĶ����ӡ���������ǲ���������ϵ�������String����Integer
		//ʹ��ObjectӦ�����У��� ����������method��������
		Demo08FanXin df = new Demo08FanXin();
		//df.method(strB);�Լ�������---->The method method(ArrayList<Object>) in the type Demo08FanXin is not applicable for the arguments (ArrayList<Integer>)
		df.method(strA); //������Ĳ����б�ΪIntegerʱ����ֻ�ܴ�������ΪInteger�Ĳ����ˣ����ʱ��ʹ��ͨ�������ȫ��������
		
	}
	public void method(ArrayList<?> strA) { //������������б��������ռ��ϣ���ʼ����д�ľ�̬����
		Iterator<?> obj = strA.iterator();
		if(obj.hasNext()) {
			System.out.println(obj.next());
		}
	}
}
