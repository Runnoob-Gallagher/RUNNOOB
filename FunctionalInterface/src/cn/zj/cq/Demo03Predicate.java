package cn.zj.cq;

import java.util.function.Predicate;

import Test.Test;

/*java.util.function.Predicate<T>�ӿ�
���ã���ĳ���������͵����ݽ����жϣ��������һ��booleanֵ��  ע���Ƕ����ݽ����жϣ����糤��ѽ����Сѽ�������������ݵ�����

Predicate�ӿ��а���һ�����󷽷���
	boolean test(T t):������ָ���������͵����ݽ����ж�*/
	
//���� Or ��  negate  �ֱ��ʾ��  ȡ��
public class Demo03Predicate {
	public static boolean Judge(String s,Predicate<String> pre) {
		return pre.test(s);
	}
	public static void main(String[] args) {
		String str ="Runnoob-Gallagher";
		Boolean boo = Judge(str, new Predicate<String>() {

			@Override
			public boolean test(String str) {
				// TODO Auto-generated method stub
				return str.length() > 16;
			}
		}); 
		//System.out.println(boo);
		Boolean bool = Judge(str,(String s) -> {
			return s.length()>25;
		});
		System.out.println(bool);
	}
}
 