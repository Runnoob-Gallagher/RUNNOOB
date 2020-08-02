package FunctionStream;

import java.util.stream.Stream;

/*
 * Stream���еĳ��÷���filter�����ڶ�Stream���е����ݽ��й���
 * Stream<T> filter<Paredicate<? super T> predicate);
 * predicate�еĳ��󷽷�  ��ĳ���������͵����ݽ����ж�
 */
public class Filter {
		public static void main(String[] args) {
			Stream<String> streamA = Stream.of("��Ϊ","ƻ��","ŵ����","��������","��о����");
			Stream<String> streamB = streamA.filter((String str) -> { return str.contains("��");})
				  .filter((String str) -> {return str.length()==2;});
			streamB.forEach((String name ) -> System.out.println(name));
		}
}
