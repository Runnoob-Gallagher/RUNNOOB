package cn.zi.cq02;
//这个demo是熟悉含有泛型的类
/*格式：
public class Classname<E> --->这里的E代表表示任意的类型，创建对象时指定什么类型他就是什么类型
那么之前指定为String类型的地方都要作相应的替换*/
/*
 * public class Demo02FanXinClass { //这里你开始什么都不写，表示Object，所以下面可以是任意类型
 * 	 private String name;
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * }
 */

public class Demo02FanXinClass<E> {
	private E name;

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
}