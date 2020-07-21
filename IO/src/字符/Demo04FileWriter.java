package 字符;

import java.io.FileWriter;
import java.io.IOException;

/*
 	构造方法：
 	
 	FileOutputStream(String name, boolean append) 
          创建一个向具有指定 name 的文件中写入数据的输出文件流。
    
    方法摘要：
    
     void write(byte[] b)  将 b.length 个字节从指定 byte 数组写入此文件输出流中。 
     void write(byte[] b, int off, int len)  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
 	 void write(int b)  将指定字节写入此文件输出流。 
	
  换行符号：
  		win:\r\n
  		Linux:/r
  		mac:/n
 */
public class Demo04FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\SVN\\Runoob"/*,true*/);//之前我没加true，写了一遍。然后加上true，下面的全部追加一遍
		char[] ch = {'我','杨','洁','今','天','好','好','学','习'};//注意字符数组的格式啊
		fw.write(ch);
		fw.flush();
		fw.write(97);
		fw.append('追');//这里可以直接追加
		fw.write("真的可以写字符串吗？好像真的可以欸");
		fw.write("\r\n");
		fw.write(ch,1,2);//这里应该是写入杨洁，表示第一个后开始写(开始索引是0，所以是0-我，1-杨。最终写杨 )，写两个 
		fw.write("黄玉虹",1,2);//这里因该是写入玉虹
		fw.close();
	}
}
