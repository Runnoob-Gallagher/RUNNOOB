package cn.zj.cq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//���Demo�Ǽ���������ַ�������ͬ��ĸ���ֵĸ���
/*ʵ�ֲ��裺
	1.��������
	2.������תΪ�ַ���
	3.���뵽������
	4.*/
public class Demo07Count {
	public static void main(String[] args) {
		//�����û�����
		System.out.println("������һ���ַ�����");
		Scanner scan = new Scanner(System.in);
		String strA = scan.nextLine();
		//����HashMap���������洢Ԫ�أ�key���ַ����е�֪����value���ظ��Ĵ���
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		for(char c : strA.toCharArray()) {
			if(mapA.containsKey(c)) { 
				Integer value = mapA.get(c);
				System.out.println(value);
			}else {   
				mapA.put(c,1);
			}     
		}          
		System.out.println(mapA);
	}
}
