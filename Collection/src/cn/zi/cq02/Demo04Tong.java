package cn.zi.cq02;

import java.util.ArrayList;
import java.util.Iterator;

//���demo��������Ϥ����ͨ�����
/*����ͨ���ֻ����Ϊ�����Ĳ���ʹ�ã��������ڴ�������ʹ��
�� ������������*/
public class Demo04Tong {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("String");
		al.add("How");
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(666);
		ai.add(999);
		Demo04Tong dt = new Demo04Tong();
	
		
		methodE(ai);
		methodE(al); 
		
	}

	public static void methodE(ArrayList<?> ae) {//�������˷���ͨ�����ʾ���Ա�ʾ�������ͣ����ڷ�����ָ���ķ�������
		Iterator<?> it = ae.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
