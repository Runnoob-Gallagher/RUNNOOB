package cn.zj.cq;

import java.util.function.Function;

/*java.util.function<T,R>�ӿ���������һ�����͵����ݵõ���һ�����͵����ݣ�
ǰ�߳�Ϊǰ�����������߳�Ϊ����������
function�ӿ�������Ҫ�ĳ��󷽷�Ϊ�� R apply(T t),��������T�Ĳ�����ȡ����R�Ľ����
���罫String����ת��ΪInteger���͡�*/
public class Demo04Function {
	/*
	 * ����һ������ ��������һ��Function�ӿڣ�����ʹ��<String,Intege>
	 * ʹ��Function�ӿ��еķ���apply�����ַ��͵�����ת��ΪInteger���ͣ�
	 */
	public static void methodA(String stry,Function<String, Integer> fun) {
		fun.apply(stry);
	}
	public static void main(String[] args) {
		String number = "7489757";
		methodA(number, new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		methodA(number,(num) -> {
			return Integer.parseInt(num); //��ʵ������е㲻�����Ҽ�Ȼ����ôд��  �һ�Ҫ���������ʽ�ӿڸ���
		});
	}
}
