package cn.zj.cq01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//���demo��������Ϥ������(Iterator)��������
//������������ȡ�������еķ����ģ�forѭ�����������������ǲ��еģ��ҵ��������ۼ��������Ԫ������
public class Demo02Iteretor {
	public static void main(String[] args) {
		Collection<String> collA = new ArrayList<String>();
		collA.add("ƻ��");
		collA.add("��Ϊ");
		collA.add("VIVO");
		collA.add("С��");
		System.out.println(collA);
//������Iterator	Դ�룺Iterator<E> iterator();
		/*
		 * Iterator��һ���ӿڣ�����ֱ��ʹ�ã���Ҫ��Iterator��ʵ�������ȥ����ʹ�ã�
		 * api: Iterator<E> iterator() �����ڴ� collection ��Ԫ���Ͻ��е����ĵ����� 
		 * ���÷�����ʹ��Collection����iterator��������Iterator��ʵ�������ʾ�����£�
		 */
//�����˶�̬            �ӿ�                                =        ʵ����
		Iterator<String> it = collA.iterator();
		/* ??????????   �������ôʵ�ֵģ�����������
		 * �������е�forѭ���� for(Iterator<String> it2 = collA.iterator();it.hasNext();) {
		 * System.out.println(it2.next()); }
		 */
		/*
		 * while(it.hasNext()) { System.out.print(it.next()); }
		 */    //��һ�β�ע�͵Ļ�������ͻᱨ��NoSuchElementException����Ϊ�Ѿ��Ƶ����һ��Ԫ���ˣ���
		boolean A = it.hasNext();
		System.out.println(A);
		String B = it.next();
		System.out.println(B);
	}
	
}
