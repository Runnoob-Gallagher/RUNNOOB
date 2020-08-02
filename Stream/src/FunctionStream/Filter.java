package FunctionStream;

import java.util.stream.Stream;

/*
 * Stream流中的常用方法filter：用于对Stream流中的数据进行过滤
 * Stream<T> filter<Paredicate<? super T> predicate);
 * predicate中的抽象方法  对某种数据类型的数据进行判断
 */
public class Filter {
		public static void main(String[] args) {
			Stream<String> streamA = Stream.of("华为","苹果","诺基亚","海康威视","中芯国际");
			Stream<String> streamB = streamA.filter((String str) -> { return str.contains("华");})
				  .filter((String str) -> {return str.length()==2;});
			streamB.forEach((String name ) -> System.out.println(name));
		}
}
