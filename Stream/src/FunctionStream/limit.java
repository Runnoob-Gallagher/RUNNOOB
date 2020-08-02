package FunctionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*limit:用于截取流中的方法     skip  类似这个limit
Stream<T> limit(long maxSize);
	参数是一个long型，如果集合当前的长度大于参数则进行截取；否则不做出操作
截取后的流是一个新的流*/
public class limit {
	public static void main(String[] args) {
		List<String> listA = new ArrayList<String>();
		listA.add("苹果");
		listA.add("梨");
		listA.add("菠萝");
		listA.add("香蕉");
		listA.add("西瓜");
		listA.add("甘蔗");
		Stream streamA = listA.stream();
		Stream streamB = streamA.limit(5);
		streamB.forEach((fruit) -> {System.out.println(fruit);});
	}
}
