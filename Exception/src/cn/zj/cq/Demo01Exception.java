package cn.zj.cq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//这个demo是介绍异常的
/*java.lang.Throwable:类是java语言中所有错误或异常的超类
	Exception:编译器异常，进行编译(写代码)java程序出现的问题
		RuntimeException：运行期异常，java程序运行过程中出现的问题
		异常就相当于一个小毛病，将异常处理掉程序就可以继续执行了
	Error错误：
		错误就相当于程序得了一个无法治愈得毛病，必须修改源代码，否则程序无法正常运行*/
public class Demo01Exception {
	/*   方法一：使用throws抛出异常
	 * public static void main(String[] args) throws ParseException {
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date date =
	 * sdf.parse("1999-11-11"); System.out.println(date); }
	 */
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse("1999-1111");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("转换报错，检查一下你的格式");
			e.printStackTrace();
		}
		System.out.println(date);
		System.out.println("try catch 可以执行后续代码");
		
		
		int[] arrA = {1,2,3,4};
		int i =4 ;
		/*
		 * try { System.out.println(arrA[i]); }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("你的数组越界啦"); } System.out.println("try catch 可以执行后续代码");
		 */
		System.out.println(arrA[i]);//这种报错不能直接throws??????
		
	}
}
