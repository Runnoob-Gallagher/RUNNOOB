package cn.zj.cq;

import java.util.function.Consumer;

/*java.util.function.Consumer<T> �ӿ���������Supplier�෴
	����������һ�����ݣ���������һ�����ݣ������������ɷ��;���
	Consumer�ӿ���һ�������ͽӿڣ�����ִ��ʲô���ͣ��Ϳ���ʹ��accept��������ʲô���͵�����
	��ô����(ʹ��)����Ҫ�Զ���(���������ȵ�)*/
public class Demo02Consumer {
	public static void MethodA(String name,Consumer<String> con,int age) {
		con.accept(name);
	}
	public static void main(String[] args) {
		MethodA("yangjie",(name) -> {System.out.println(name);},24);
		MethodA("Runnoob-Gallagher",(name) -> {
			String Newname = new StringBuffer(name).reverse().toString();
			System.out.println(Newname);
		},24);
	}
}
