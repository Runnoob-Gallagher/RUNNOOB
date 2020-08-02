package FunctionStream;

import java.util.stream.Stream;

/*
	 * Stream流中的常用方法forEach
	 * void forEach(Consumer<? super T> action)
	 * 该方法接收的是一个Consumer接口函数，会将每一个元素交给该函数进行处理。
	 * Consumer接口是一个消费性的函数式接口，对指定类型的数据进行处理，
	 * 
	 * forEach是一个终结方法，用以遍历流中的数据。  注意终结的意思
	 */
public class Foreach {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("中","美","英","法","德","韩");
		stream.forEach((String name) -> {System.out.println(name);});
		//简化
		stream.forEach((name) -> System.out.println(name)); //如果你直接这样执行是会报错的的，因为forEach是中介方法。一旦执行后就不能再使用流中的方法
		//除非你在创建一个新的StramA流   前面一个stream流 已经被使用了
	}
}
