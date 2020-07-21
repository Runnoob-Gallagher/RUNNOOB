package 字节;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//文件复制
	//考虑win的复制粘贴，复制就是读也就是输入，从磁盘中读到内存中；粘贴就是写也就是输出，从内存中写到磁盘中
public class Demo06Copy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\TortoiseSVN\\Code_Gallagher\\sbf-app-web.war");
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher\\sbf-app-web.war");
		byte[] bt = new byte[1024];
		int len = 0;
		while((len=fis.read(bt))!=-1) {
			fos.write(bt);;
		} 
	
		fos.close(); 
		fis.close();  
	}
}
