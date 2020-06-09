package cn.zj.cq;

import java.util.HashMap;
import java.util.Hashtable;

//���demo�ǲ���HashTable��
/*java.utils.HashTable<K,V> ���� implements Map<K,V>�ӿ�
Hashtable:�ײ�Ҳ��һ����ϣ����һ���̰߳�ȫ�ļ��ϣ��ǵ��̼߳��ϣ��ٶ���
HashMap���ײ�Ҳ��һ����ϣ����һ���̲߳���ȫ�ļ��ϣ��Ƕ��̵߳ļ��ϣ��ٶȿ�
HashMap���ϣ����Դ洢nullֵ��nullֵ
Hashtable���ϣ����ܴ洢nullֵ
 
Hashtable��Vector��HashMap��ArrayListȡ��*/
public class Demo06HashTable {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(null,null);
		hm.put("c",null); 
		hm.put(null,"b"); 
		hm.put("a","a");
		System.out.println(hm);//{null=b, a=a, c=null}
		Hashtable<String, String> ht = new Hashtable<String, String>();
		//ht.put(null, "a");//java.lang.NullPointerException
		//ht.put(null, null);//java.lang.NullPointerException
		ht.put("b", "a");//{b=a}
		//ht.put("a", null);//java.lang.NullPointerException
		System.out.println(ht);
	}
}
