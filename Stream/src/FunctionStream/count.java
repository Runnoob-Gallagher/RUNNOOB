package FunctionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//count����������Stream����Ԫ�صĸ���
	
public class count {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("ƻ��");
		list.add("��");
		list.add("����");
		list.add("�㽶");
		list.add("����");
		list.add("����");
		//��List����ת��ΪStream��
		Stream streamA = list.stream();
		long num = streamA.count();
		System.out.println(num);
	} 
}
