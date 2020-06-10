package cn.zj.cq;
//throw关键字

/*作用---> 使用throw关键字在指定的方法中抛出异常
格式--->throw new xxxException("异常产生的原因");
zhuyi :
	1.throw关键字必须写在方法的内部
	2.throw关键字后边new的对象必须是Exception或者其子类对象
	3.throw关键字抛出的异常对象，我们就必须处理这个异常对象
		throw关键字后边创建的是RuntimeException或者RuntimeException的子类，我们可以不处理，默认交给JVM处理（打印异常对象，中断程序)
		throw关键字后边创建的是编译器异常(写代码的时候报错)，我们就必须处理这个异常，要么throws要么try catch
		*/
//NullPointerException 是一个运行期异常，不需要我们自己处理，交给JVM
public class Demo03Throw {
	public static void main(String[] args) {
		int[] arrA = {1,2,3,4,5};
	//	int[] arrA = null;
		methodA(arrA, 5);//再给方法传递参数的时候，需要进行合法性校验---->比如参数传递的是一个空的呢
	}
	public static int methodA(int[] arr,int index) {
		if(arr == null) {
			throw new NullPointerException("你传递的参数是空的");//根据Demo02WhyException的处理异常得步骤，JVM会创建处理异常的对象，这里就是；
		}
		if(index < 0 ||index > arr.length-1) {
			throw new ArrayIndexOutOfBoundsException("数据越界异常");
		}
		int result = arr[index];
		return result;
	}
}
