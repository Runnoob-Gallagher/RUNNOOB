package cn.zj.cq;

import java.util.HashSet;
import java.util.Iterator;

//���demo��˵��HashSet��Ҫ��дhashcode������equals������
public class Demo07RedoHashSet {
	public static void main(String[] args) {
		HashSet<Demo07Person> hp = new HashSet<>();
		Demo07Person dpA = new Demo07Person("������",55);
		Demo07Person dpB = new Demo07Person("������",66);
		Demo07Person dpC = new Demo07Person("�°���",77);
		Demo07Person dpD = new Demo07Person("�°���",77);
		/*                     �����ҵ����˼���Ǵ����
		 * Iterator<Demo07Person> ip = hp.iterator(); while(ip.hasNext()) {
		 * System.out.println(((Iterator<Demo07Person>) hp).next()); }
		 */
		hp.add(dpD);
		hp.add(dpC);
		hp.add(dpB);
		hp.add(dpA);
		Iterator<Demo07Person> it = hp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//�������������ȫ����������ˣ�Ϊʲô---->��Ϊhashcodeֵ��һ��
		}
		System.out.println(dpC.hashCode());//1829164700
		System.out.println(dpD.hashCode());//366712642
		//�������ֻ��������һ���ͱ�ʾȫ����ͬ���Ͳ����ظ��������������---->��дhashcode����
		/*
		 * �ó������
		 *  Demo07PeoPle [name=������, age=66] 
		 *  Demo07PeoPle [name=������, age=55]
		 *  Demo07PeoPle [name=�°���, age=77] 
		 *  22780977 
		 *  22780977
		 */
	}
}
