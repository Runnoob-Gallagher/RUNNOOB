package cn.zj.cq;

import java.util.function.Consumer;

import javax.xml.ws.handler.MessageContext;

/*��ϰ��
	�ַ��������д��ж�����Ϣ�����ո�ʽ����������XX �����䣺XX���ĸ�ʽ��ӡ����
	ʹ��Lambda���ʽ*/

//���demo��ע����ڣ� String[] str  ��������ͣ� ���ε����ͱ����Ӧ����� �����ַ����ı���Ҫ�����
public class Demo02Consum {

	
	public static void  Fetch(String[] str,Consumer<String> conA,Consumer<String> conB) {
		for (String message : str) {
			conA.andThen(conB).accept(message);//����ÿһ��message����һ�����飬�ָ�ʱmessage.split[0]�ʹ�����������һ��Ԫ��
		}
	}
	public static void main(String[] args) {
		String[] arry = {"ƻ��,100��","��Ϊ,1000��","С��,50��"};
		/*
		 * for (String string : arry)
		 *  { System.out.println(string); } //��ס�����������ڱ�������
		 */
				Fetch(arry,
				  (message) -> {System.out.print(message.split(",")[0]);}, 
				  (message) -> {System.out.println(message.split(",")[1]);});
		 
	}
}
