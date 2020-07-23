package Buffer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo05GBK {
	public static void main(String[] args) throws IOException {
		/*
		 * FileWriter fw = new FileWriter("E:\\SVN\\Galla.txt"); char[] chA =
		 * {'加','油','呦','杨','洁'};//eclipse的默认编码格式为GBK 
		 * fw.write(chA);
		 */
		
		  FileReader fr = new FileReader("E:\\\\SVN\\\\Galla.txt"); 
		  int len;
		  while((len = fr.read()) != -1) {
			  System.out.println((char)len);
		  } 
		  fr.close();
		 
//		fw.close();
	}
}
