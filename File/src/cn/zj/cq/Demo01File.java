package cn.zj.cq;

import java.io.File;

public class Demo01File {
	public static void main(String[] args) {
		
		//打印分隔符和分号   因为是静态的，直接用File类
	  /*static String pathSeparator   		与系统有关的路径分隔符，为了方便，它被表示为一个字符串。 
        static char pathSeparatorChar 		与系统有关的路径分隔符。 
        static String separator 	  		与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。 
        static char separatorChar     		与系统有关的默认名称分隔符。*/
		String pathSeparatorA = File.pathSeparator;
		System.out.println("字符串形势的分号    " + pathSeparatorA);
		char pathSeparatorB = File.pathSeparatorChar;
		System.out.println("字符形式的分号   " + pathSeparatorB);
		String separatorC = File.separator;  //注意在win中分隔符是 \  在linux中是  /
		System.out.println("字符串形式的分隔符    " + separatorC);
		char separatorD = File.separatorChar;
		System.out.println("字符形式的分隔符    " + separatorD);
	}
}
