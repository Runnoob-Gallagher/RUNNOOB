package cn.zj.cq;

import java.util.function.Consumer;

import javax.xml.ws.handler.MessageContext;

/*练习：
	字符串数组中存有多条信息，按照格式：“姓名：XX 。年龄：XX”的格式打印出来
	使用Lambda表达式*/

//这个demo的注意点在： String[] str  这个的类型， 传参的类型必须对应清楚。 对于字符串的遍历要清楚！
public class Demo02Consum {

	
	public static void  Fetch(String[] str,Consumer<String> conA,Consumer<String> conB) {
		for (String message : str) {
			conA.andThen(conB).accept(message);//这样每一个message就是一个数组，分割时message.split[0]就代表数组中嗲一个元素
		}
	}
	public static void main(String[] args) {
		String[] arry = {"苹果,100亿","华为,1000亿","小米,50亿"};
		/*
		 * for (String string : arry)
		 *  { System.out.println(string); } //记住这样我们是在遍历数组
		 */
				Fetch(arry,
				  (message) -> {System.out.print(message.split(",")[0]);}, 
				  (message) -> {System.out.println(message.split(",")[1]);});
		 
	}
}
