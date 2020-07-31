package cn.zj.cq;
/*
Consumer�ӿ�Ĭ�Ϸ���andThen
	���ã���Ҫ����Consumer�ӿڣ����԰�����Consumer�ӿ���ϵ�һ���ڶ����ݽ�������
	
	���磺
		Consumer<String> con1
		Consumer<String> con2
		String s = "Hello";
		con1.accept(s);
		con2.accept(s);
��ͬ�ڣ�  con1.andThen(con2).accept(s):�����Ⱥ�˳������

Դ���룺
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
//		con1.andThen(con2).accept();  ��Ϊ��ǰ�治��һ���������ͣ����Բ���ʹ��andThen
		con1.andThen(con2).accept(name);
	}
	public static void main(String[] args) {
	//	Handle("Gallagher",(name) -> {System.out.println(name);},(age) -> {System.out.println(age);},24);
		//����һ�δ��룬������д����age����Ҫ���int���͵����䡣����Consumer�������String���ͣ���ô��ֻ��ȥƥ��Name
		Handle("Runnoob-Gallagher",
				(name) -> {System.out.println(name.toUpperCase());},
				(name) -> {System.out.println(name.toLowerCase());}, 25);
	}
}
