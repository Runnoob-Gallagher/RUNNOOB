package cn.zj.cq;

import java.util.HashMap;
import java.util.Map;

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
		System.out.println(mapA);
	}
}
