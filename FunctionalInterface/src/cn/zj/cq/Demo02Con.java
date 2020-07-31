package cn.zj.cq;
/*
Consumer接口默认方法andThen
	作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，在对数据进行消费
	
	例如：
		Consumer<String> con1
		Consumer<String> con2
		String s = "Hello";
		con1.accept(s);
		con2.accept(s);
等同于：  con1.andThen(con2).accept(s):根据先后顺序消费

源代码：
		default Consumer<T> andThen (Consumer<? super T> after){
			Objects.requireNotNull(after);
			return (T t) -> {accept(t); after.accept(t);};
} 
*/
import java.util.function.Consumer;

//andthen
public class Demo02Con {
	public static void Handle(String name,Consumer<String> con1 ,Consumer<String> con2,int age) {
//	public static void Handle(String name,Consumer<String> con1 ,Consumer<Integer> con2,int age) {
		con1.accept(name);
		con2.accept(name);
//		con1.andThen(con2).accept();  因为我前面不是一种数据类型，所以不能使用andThen
		con1.andThen(con2).accept(name);
	}
	public static void main(String[] args) {
	//	Handle("Gallagher",(name) -> {System.out.println(name);},(age) -> {System.out.println(age);},24);
		//上面一段代码，就算你写的是age，想要输出int类型的年龄。但是Consumer定义的是String类型，那么它只有去匹配Name
		Handle("Runnoob-Gallagher",
				(name) -> {System.out.println(name.toUpperCase());},
				(name) -> {System.out.println(name.toLowerCase());}, 25);
	}
}
