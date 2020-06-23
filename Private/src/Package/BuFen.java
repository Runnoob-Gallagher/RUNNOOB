package Package;
//局部内部类表示某个类在方法中
//前面所说的局部变量呀，方法。都是指在方法中，出了方法就不能访问了，那么就只有方法能访问它了
/*格式:
	修饰符 class 类名称{
		修饰符 返回值类型 方法名称(参数列表) {
			 class 类名称{//局部内部类不能写修饰符？？？
				....
			}
		}
}*/
/*注意：
	局部内部类中的局部变量需要加上final关键字，在JDK8后
原因：
	创建的对象存放在堆中，
	创建的方法在栈中，方法执行完毕，立刻出栈，里面的变量也随之消失
	如果方法出栈了，但是对象还没消息，想继续使用方法中的变量，就要确保变量值不变，所以用final*/
public class BuFen {
	public void methodA() {
		class Inner{//称之为局部内部类，如何使用到Inner这个类呢，就要用对象去调用
			int age = 24;
		public void InnerMethod() {
			System.out.println(age);
		}
		}
		
		  Inner in = new Inner(); //这里实在方法内部，出了方法就不能使用，只有自己才能访问。用内部类的对象去访问方法
		  in.InnerMethod();
		 
	}
}
