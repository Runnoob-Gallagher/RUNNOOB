package cn.zj.cq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//���demo����ϰ�Զ������
/*1.�����û�����
2.ʹ��Map���ϴ���Ѿ����ڵ�ע����Ϣ
3.ͨ��Map���ϵķ������ж���Ϣ�Ƿ����
4.�����Ϣ������ô����ʾ����*/
public class Demo10DefineException {
	public static void main(String[] args) throws RegisterException {
		/*
		 * Map<String, Integer> mapA = new HashMap<String, Integer>(); mapA.put("���",
		 * 26); mapA.put("���", 24); mapA.put("̷���", 25); mapA.put("���", 25);
		 * System.out.println("���������ע��������"); Scanner sc = new Scanner(System.in);
		 * //System.out.println(sc); //System.out.println(mapA);
		 */	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ע��������");
		String name = sc.next();
		methodA(name);
		
	}
	public static void methodA(String s) throws RegisterException {
		String[] strA = {"���","̷���","����","̽�ռ�"};
		for(int i=0;i<strA.length;i++) {
			if(s.equals(strA[i])) {
				throw new RegisterException("�Բ��𣬸��û���ע��");
			}
		}
		System.out.println("��ϲ��ע��ɹ�");
	}
}
