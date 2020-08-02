package FunctionStream;

import java.util.function.Function;
import java.util.stream.Stream;

/*
	 * �����е�Ԫ��ӳ�䵽��һ�����У�����ʹ��map����
	 * <R> Stream<R> map(Function<? super T,? extends R> mapper);
	 * �ýӿ���Ҫһ��Function����ʽ�ӿڲ��������Խ���ǰ��T��������ת��ΪR�������ݵ���
	 * Function�еĳ��󷽷�
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
		streamA.forEach((number) -> System.out.println(number + "  " + getType(number/* + 1*/) ));  //������֤������ȷʵ������ת��.�����number + 1  Ϊʲô����   ֤����������Ȼ����һ�����壿
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
