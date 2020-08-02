package FunctionStream;

import java.util.function.Function;
import java.util.stream.Stream;

/*
	 * 将流中的元素映射到另一个流中，可以使用map方法
	 * <R> Stream<R> map(Function<? super T,? extends R> mapper);
	 * 该接口需要一个Function函数式接口参数，可以将当前流T类型数据转换为R类型数据的流
	 * Function中的抽象方法
	 * 	R apply(T t);
	 */
public class map {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("123","234","345","456","567");
		Stream<Integer> streamA = stream.map(new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return Integer.parseInt(t);
			}
		});
		streamA.forEach((number) -> System.out.println(number + "  " + getType(number/* + 1*/) ));  //这个真的证明了它确实进行了转换.里面的number + 1  为什么不行   证明他是流，然后是一个整体？
	}
	public static <T> String getType(T t){
		if(t instanceof String){
		return "string";
		}else if(t instanceof Integer){ 
		return "int";
		}else{
		return " do not know";
		}
}
}
