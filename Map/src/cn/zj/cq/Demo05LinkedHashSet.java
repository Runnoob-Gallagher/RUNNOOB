package cn.zj.cq;

import java.util.HashMap;
import java.util.LinkedHashMap;

//���demo����֤LinkedHashSet�������ԺͲ������ظ���
/*java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 * �ײ�ԭ��
 * 	��ϣ��+������¼Ԫ��˳��
 * */
public class Demo05LinkedHashSet {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("һ", 1);
		hm.put("��", 2);
		hm.put("��", 3);
		hm.put("��", 4);
		hm.put("��", 4);
		System.out.println(hm);//�����,�������ظ�---->{һ=1, ��=3, ��=4, ��=2}
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("һ", 1);
		lm.put("��", 2);
		lm.put("��", 3);
		lm.put("��", 4);
		lm.put("��", 4);
		System.out.println(lm);//���򣬲������ظ�---->{һ=1, ��=2, ��=3, ��=4}
}
}
