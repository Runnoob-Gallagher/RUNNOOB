package cn.zj.cq;
//这个demo是用以说明可变参数的：
/*特点：
1.当方法的参数列表的数据类型已经确定，但是参数个数不定。---->使用可变参数
2.格式：
修饰符 返回值类型 方法名(数据类型...变量名) {}
3.原理：
可变参数底层就是一个数组，根据传递参数个数的不同，创建不同长度的数组来存储这些参数*/
public class Demo09Variable {
		public static void main(String[] args) {
			System.out.println(methodA(99, 99));
			System.out.println(methodB(1,2,3,4,5,6,7,8,9,10));
		}
		public static int methodA(int a,int b) {//如果这里的参数个数很多的话，那就不合适了。使用可变参数来解决
			return a+b;
		}
		public static int methodB(int...var) {
			int sum = 0;
			for(int i:var) {
				sum += i;
			}
			return sum;
		}
}
