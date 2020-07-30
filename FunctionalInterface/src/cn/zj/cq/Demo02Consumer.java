package cn.zj.cq;

import java.util.function.Consumer;

/*java.util.function.Consumer<T> 接口则正好与Supplier相反
	它不事生产一个数据，而是消费一个数据，其数据类型由泛型决定
	Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accept方法消费什么类型的数据
	怎么消费(使用)，需要自定义(输出，计算等等)*/
public class Demo02Consumer {
	public static void MethodA(String name,Consumer<String> con,int age) {
		con.accept(name);
	}
	public static void main(String[] args) {
		MethodA("yangjie",(name) -> {System.out.println(name);},24);
		MethodA("Runnoob-Gallagher",(name) -> {
			String Newname = new StringBuffer(name).reverse().toString();
			System.out.println(Newname);
		},24);
	}
}
