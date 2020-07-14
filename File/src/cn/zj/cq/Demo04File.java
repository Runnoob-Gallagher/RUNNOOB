package cn.zj.cq;

import java.io.File;
/*String[] list() 
返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。 */
public class Demo04File {
	public static void main(String[] args) {
		File fileA = new File("E:\\SVN");
		String[] file = fileA.list();
		for(String fileB : file) { 
			System.out.println(fileB);
		}              //----------------》这两个的区别就是返回的类型不同一个是String类型，一个是File类型
/*File[] listFiles() 
         返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。*/
		File[] fileB = fileA.listFiles();
		for(File fileC: fileB) {
			System.out.println(fileC);
		}
	}
}
