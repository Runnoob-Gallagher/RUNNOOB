package cn.zj.cq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//���demo����ϰEntry����Map���ϵĵڶ��ֱ�����ʽ
/*Map.Entry<K,V>:��Map�ӿ�����һ���ڲ��ӿ�Entry
���ã���Map����һ��������ô�ͻ���Map�����д���һ��Entry��������¼����ֵ����ֵ�Զ��󣬽���ֵ��ӳ���ϵ��
Set<Map.Entry<K,V>> entrySet() -->��Map�����ڲ��Ķ��Entry����ȡ�����洢��Set������*/
/*Map�����еķ���----> 
Set<Map.Entry<K,V>> entrySet()  ���ش�ӳ���а�����ӳ���ϵ��Set��ͼ��
	ʵ�ֲ��裺
		1.ʹ��Map�����еķ���entrySet()����Map�����еĶ��Entry����ȡ�������洢��Set������ȥ
		2.����
		3.ʹ��Entry�����еķ���getKey()��getValue()��ȡ����ֵ*/
public class Demo03EntrySet {
	public static void main(String[] args) {
		Map<String, Integer> mapA = new HashMap<String, Integer>();
		mapA.put("�����", 1);
		mapA.put("��ɮ", 2);
		mapA.put("ɳɮ", 3);
		mapA.put("��˽�", 4); 
		//System.out.println(mapA);
		Set<Map.Entry<String, Integer>> set = mapA.entrySet();//Map.Entry��ʾ�ⲿ�������ڲ���(�㿴�Աߵ��б�)----->ͨ��Map�ҵ�Entry��---��static interface Map.Entry<K,V> ӳ�����-ֵ�ԣ��� 
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> key = it.next();
			System.out.println(key);
		}
		/*
		 * for(Entry<String,Integer> entry:set) { System.out.println(entry); }
		 */
	}
} 
