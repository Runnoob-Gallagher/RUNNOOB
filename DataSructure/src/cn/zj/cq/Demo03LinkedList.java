package cn.zj.cq;

import java.util.LinkedList;
import java.util.List;

//���demo�����Բ���LinkedList����----��LinkedList���ϲ���ʹ�ö�̬������������,�����Ҿ���ʹ�ö�̬�ˣ�������������
/*java.util.LinkedList���� implements list�ӿ�
LinkedList�����ص㣺
1.�ײ���һ������ṹ����ѯ������ɾ��
2.����������λԪ�صķ���
public void addFirst(E e):��ָ��Ԫ�ز����б�ͷ
public void addLast(E e):��ָ��Ԫ����ӵ����б�Ľ�β
public void push(E e):��Ԫ�ش��б�����ʾ�Ķ�ջ
public E getFirst():���ش��б�ĵ�һ��Ԫ��
public E removeFirst():�Ƴ������ش��б�ĵ�һ��Ԫ��
public E removeLast():�Ƴ������ش��б�����һ��Ԫ��
public E pop():�Ӵ��б�����ʾ�Ķ�ջ������һ��Ԫ��
public boolean isEmpty():����б�����Ԫ�أ��򷵻�true*/
public class Demo03LinkedList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		List listA = new LinkedList();
		list.add("Ӣ��");
		list.add("����");
		list.add("��ѧ");
		list.add("����");
		System.out.println(list);
		LinkedList<String> ll = (LinkedList) list;
		ll.addFirst("����");
		System.out.println(list);
		ll.addLast("�����");
		System.out.println(list);
		Boolean b = ll.isEmpty();
		System.out.println(b);
		ll.push("������");
		System.out.println(list);
		ll.pop();
		System.out.println(ll);
		String aa = ll.getFirst();
		String bb = ll.getLast();
		System.out.println(aa +" " + bb);
		}
		
}









