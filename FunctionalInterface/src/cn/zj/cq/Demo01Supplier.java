package cn.zj.cq;

import java.util.function.Supplier;

/*SupplierΪ����ʽ�ӿڣ�
	java.util.function.Supplier<T>�ӿڽ�����һ���޲εķ�����T get() ������ȡһ�����Ͳ���ָ�����͵Ķ������ݡ�
	Supplier<T>�ӿڳ�Ϊ�����ͽӿڣ�ָ���ӿڵķ�����ʲô���ͣ���ô�ӿ��е�get�����ͻ�����ʲô���͵�����*/
public class Demo01Supplier {
	public static String GetSomething(Supplier<String> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		String s =GetSomething(() -> "����ʽ�ӿڣ����޲���");  //����ķ���ֵ���;��Ƿ��Ͷ��������
		System.out.println(s);
	}
}
