package DemoStream;

import java.util.ArrayList;
import java.util.List;

/*
 * IO����Ҫ���ڶ�д��Stream���ڶԼ��Ϻ�������м򻯲����������ϻ�����ת��ΪStream����Ȼ��ʹ�����еķ��������ݽ��в���
 * Pipelining--��ˮ�ߡ��ܵ�     �м�Ķ��������Ϊһ���ܵ���ÿһ�����м�������᷵����������
 * �ڲ�������֮ǰ�ļ��ϱ�������ͨ��������Iterator��������for��ʾ���ڼ����ⲿ���е�����Stream���ṩ�ڲ������ķ�ʽ��ͨ����ֱ�ӱ�������
 * �����������裺
 * 		1.��ȡһ������ԴSource
 * 		2.����ת��--->ת��ΪStream��
 * 		3.ִ�в�����ȡ��Ҫ�Ľ��
 */
public class Demo01Stream {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("���");
		list.add("�����");
		list.add("������");
		list.add("�����");
		list.add("����");
		list.add("������");
		//�Լ��Ͻ��й��ˣ�Ȼ��洢���¼���
		list.stream().filter((name) -> {return name.startsWith("��");})  //��Ч�� name.startsWith("��")  ͬ����
		.filter((name) -> name.length()== 2)
		.forEach((name) -> System.out.println(name));
	}
		
}
