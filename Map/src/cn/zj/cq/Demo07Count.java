package cn.zj.cq;
//���demo�Ǽ���������ַ����е���ͬ��ĸ�ĸ���----���testһ��
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//���Demo�Ǽ���������ַ�������ͬ��ĸ���ֵĸ���
/*ʵ�ֲ��裺
	1.��������
	2.����һ��HashMap�����Դ���Ԫ�أ�����key�������Ԫ�أ�value�ǳ��ֵĴ���
	3.���������Ԫ�أ����жϳ��ֵĴ���
	4.*/
public class Demo07Count {
	public static void main(String[] args) {
		//�����û�����
		System.out.println("������һ���ַ�����");
		Scanner scan = new Scanner(System.in);
		String strA = scan.nextLine();
		//����HashMap���������洢Ԫ�أ�key���ַ����е����룬value���ظ��Ĵ���
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		for(char c : strA.toCharArray()) {//???��������ô����ת���ģ���ʲô��ֱ��ת��ȴ����
			if(mapA.containsKey(c)) { 
				Integer value = mapA.get(c);//��Ȼ���ҵ�һ���ظ��ģ���Ϊ��һ���Ѿ�����(c,1)�͵õ�valueΪ1
				value++;//����ľ��Ƿ�����һ���ظ��ľͼ�1;
				mapA.put(c, value);//Ȼ���µ�ֵд�뵽������
			}else {   
				mapA.put(c,1);//������Ԫ�ؿ϶��ǲ����ڵģ��϶�������ִ��else���õ�(c,1)��
			}     
		}          
		System.out.println(mapA);
	}
}
