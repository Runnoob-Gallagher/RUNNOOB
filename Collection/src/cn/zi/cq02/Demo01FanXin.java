package cn.zi.cq02;
//���demo�������������÷��͵ĺô���ȱ�㣺ָ�����;Ͳ������ת���쳣
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01FanXin {
	public static void main(String[] args) {
		ArrayList arrA = new ArrayList();//�������÷��͵�ʱ������ΪObject
		arrA.add("����String����");
		arrA.add(5);
		arrA.add(true); 
		for(Object obj:arrA) {
			System.out.println(obj);
		}
		Iterator<String> it = arrA.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			//��ʹ������ת�͵�ʱ�򣺻��������ת���쳣
			String strA = (String) obj;
			System.out.println(strA.length());//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		}
		
	}
}
