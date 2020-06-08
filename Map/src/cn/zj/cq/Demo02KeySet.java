package cn.zj.cq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//��ϤMap���ϵı�������
/*Map���ϵĵ�һ�ֱ���������ͨ������ֵ�÷�ʽ
Map�����еķ�����
	Set<K> keySet() ����ӳ���а����ļ���Set��ͼ
ʵ�ֲ��裺
	1.ʹ��Map�����еķ���keySet(),��Map�����е�keyȡ�������洢��һ��Set������ȥ
	2.����Set���ϣ���ȡMap�����ص�ÿһ��key
	3.ͨ��Map���ϵķ���get(key),ͨ��key�ҵ�value*/
public class Demo02KeySet {
	public static void main(String[] args) {
		Map<String,Integer> mapA = new HashMap();
		mapA.put("�й�",6666);
		mapA.put("����",4444);
		mapA.put("����",3333); 
		mapA.put("����",2222);
		Set<String> set = mapA.keySet();
		//System.out.println(set);
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +"="+ mapA.get(key));
		} 
		  for(String value: set) {
			  System.out.println(value + "=" + mapA.get(value));
		  } 
		
		  
		
	}
}
