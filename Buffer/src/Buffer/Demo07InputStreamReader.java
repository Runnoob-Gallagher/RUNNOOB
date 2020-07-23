package Buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 public class InputStreamReader extends Reader;InputStreamReader 是字节流通向字符流的桥梁：
 它使用指定的 charset 读取字节并将其解码为字符(把看不懂的，变为看懂的)。它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。 

每次调用 InputStreamReader 中的一个 read() 方法都会导致从底层输入流读取一个或多个字节。（文件中保存的都是字节）
要启用从字节到字符的有效转换，可以提前从底层流读取更多的字节，使其超过满足当前读取操作所需的字节。 

	构造方法摘要 
		InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader。 
		InputStreamReader(InputStream in, String charsetName) 创建使用指定字符集的 InputStreamReader。
	构造方法中的编码名称要和文件中的一致，否则会出现乱码；
 */
public class Demo07InputStreamReader {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\SVN\\Writer");
		InputStreamReader isr = new InputStreamReader(fis/* ,"utf-8" */);
		int len = 0;
		while((len = isr.read()) != -1) {
			System.out.println((char)len);
		}
		isr.close();
	}
}
