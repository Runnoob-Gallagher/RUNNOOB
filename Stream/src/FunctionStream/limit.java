package FunctionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*limit:���ڽ�ȡ���еķ���     skip  �������limit
Stream<T> limit(long maxSize);
	������һ��long�ͣ�������ϵ�ǰ�ĳ��ȴ��ڲ�������н�ȡ��������������
��ȡ�������һ���µ���*/
public class limit {
	public static void main(String[] args) {
		List<String> listA = new ArrayList<String>();
		listA.add("ƻ��");
		listA.add("��");
		listA.add("����");
		listA.add("�㽶");
		listA.add("����");
		listA.add("����");
		Stream streamA = listA.stream();
		Stream streamB = streamA.limit(5);
		streamB.forEach((fruit) -> {System.out.println(fruit);});
	}
}
