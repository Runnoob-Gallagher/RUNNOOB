package FunctionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//count方法，计算Stream流中元素的个数
	
public class count {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("苹果");
		list.add("梨");
		list.add("菠萝");
		list.add("香蕉");
		list.add("西瓜");
		list.add("甘蔗");
		//将List集合转换为Stream流
		Stream streamA = list.stream();
		long num = streamA.count();
		System.out.println(num);
	} 
}
