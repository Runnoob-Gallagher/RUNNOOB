package cn.zi.cq02;
//���demo����Ϥ���з��͵���
/*��ʽ��
public class Classname<E> --->�����E�����ʾ��������ͣ���������ʱָ��ʲô����������ʲô����
��ô֮ǰָ��ΪString���͵ĵط���Ҫ����Ӧ���滻*/
/*
 * public class Demo02FanXinClass { //�����㿪ʼʲô����д����ʾObject�����������������������
 * 	 private String name;
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * }
 */

public class Demo02FanXinClass<E> {
	private E name;

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
}