package cn.zj.cq;
//���demo��˵��ΪʲôSet���ϲ��ܴ洢�ظ�Ԫ��
//ԭ��:��ΪSet������д��add������������Ԫ�ص�ʱ������hashcode����ȥ�Ƚ�Ԫ�ص�hashcodeֵ�Ƿ�һ����Ȼ���ٵ���equals�����Ƚ����ݣ�
import java.util.HashSet;

public class Demo06HashSet {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("abc");//hashֵΪ96354
		hash.add("abc");//hashֵΪ96354  eauqls�����ȽϺ�����ȡ����Ԫ�ؾ�֤�����ظ���
		hash.add("ͨ��");//hashֵΪ1179395
		hash.add("�ֵ�");//hashֵΪ1179395
		System.out.println(hash);
	}
}
