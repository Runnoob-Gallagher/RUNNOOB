package cn.zj.cq;
//这个demo是熟悉自定义异常类
/*	格式：
		public class XXXException extends Exception / RuntimeException{
			添加一个空参数的构造方法
			添加一个带参数的构造方法
	}
	注意：
		自定义异常类一般是以Exception结尾，说明该类是一个异常类
			继承Exception：那么自定义的异常类就是一个编译器异常，如果方法内部抛出这个编译器异常，就要去处理它，要么try、throws
			继承RuntimeException:那么就是一个运行期异常，无需处理交给java虚拟机；*/
public class RegisterException extends Exception {
		public  RegisterException () {
			super();
		}
		public RegisterException (String s ){
			super(s);
		}
}
