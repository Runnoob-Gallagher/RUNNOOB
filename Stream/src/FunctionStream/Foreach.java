package FunctionStream;

import java.util.stream.Stream;

/*
	 * Stream���еĳ��÷���forEach
	 * void forEach(Consumer<? super T> action)
	 * �÷������յ���һ��Consumer�ӿں������Ὣÿһ��Ԫ�ؽ����ú������д���
	 * Consumer�ӿ���һ�������Եĺ���ʽ�ӿڣ���ָ�����͵����ݽ��д���
	 * 
	 * forEach��һ���ս᷽�������Ա������е����ݡ�  ע���ս����˼
	 */
public class Foreach {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("��","��","Ӣ","��","��","��");
		stream.forEach((String name) -> {System.out.println(name);});
		//��
		stream.forEach((name) -> System.out.println(name)); //�����ֱ������ִ���ǻᱨ��ĵģ���ΪforEach���н鷽����һ��ִ�к�Ͳ�����ʹ�����еķ���
		//�������ڴ���һ���µ�StramA��   ǰ��һ��stream�� �Ѿ���ʹ����
	}
}
