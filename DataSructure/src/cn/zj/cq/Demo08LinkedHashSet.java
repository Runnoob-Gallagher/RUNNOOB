package cn.zj.cq;

import java.util.HashSet;
import java.util.LinkedHashSet;

//���demo��˵��LinkedHashSet���ϵ�
/*LinkedHashSet���� extends HashSet����
LinkedHashSet�����ص㣺
	�ײ���һ����ϣ������+����/�������+ ����---->��������Ǽ�¼Ԫ�صĴ洢˳�򣬱�֤��Ԫ�ص�ͬ����*/
public class Demo08LinkedHashSet {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("Apple");
		hash.add("HuaWei");
		hash.add("Vivo");
		hash.add("Apple");
		System.out.println(hash);
		//��������[Apple, Vivo, HuaWei]---->���Է��ֲ��ܴ洢�ظ����ݣ�Ԫ�ص�˳���ܱ�֤���ٿ�һ��LinkedHashSet
		LinkedHashSet<String> link = new LinkedHashSet<String>();
		link.add("��");
		link.add("��");
		link.add("��");
		link.add("��");
		link.add("��");
		System.out.println(link);//���ڽ�����ǶԵ�
	}
}
