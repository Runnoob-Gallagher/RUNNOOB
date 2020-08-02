package FunctionStream;
//将两个流合并为一个流。使用Stream里面的静态方法 concat
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class concat {
	public static void main(String[] args) {
		List<String> listA = new ArrayList<String>();
		listA.add("Good Good Study,");
		List<String> listB = new ArrayList<String>();
		listA.add("Day Day Up。");
		Stream streamA = listA.stream();
		Stream streamB = listB.stream();
		Stream streamC = Stream.concat(streamA, streamB);
		streamC.forEach((name) -> System.out.print(name));
		
	}
}
