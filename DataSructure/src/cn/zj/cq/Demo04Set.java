package cn.zj.cq;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*����һ��Set���ϵ�demo---->java.utils.HashSet���� implements Set�ӿ� 
�ص㣺
1.Set���ϲ������ظ�Ԫ�أ�
2.û�д������ķ������Ȳ���ʹ����ͨ��forѭ����
3.��Ϊ�������������Դ��ȥ��ȡ������Ԫ�ص�˳����ܲ�һ��
4.�ײ��ǹ�ϣ��ṹ����ѯ�ٶȷǳ���*/
public class Demo04Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("����");
		set.add("�й�");
		set.add("Ӣ��");
		set.add("����");
		set.add("����");
				Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
