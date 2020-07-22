package Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/*
 * 对乱序的文本进行排序：
 *  String[] split(String regex)  根据给定正则表达式的匹配拆分此字符串 
 *  HashMap加入数据后，会自动根据首字母排序
 *  String readLine() 
          读取一个文本行。 
 *  
 *  操作步骤：
 *  1.创建一个FileReader字符输入流，操作对象到内存；在构造器中提供字符输入流的目标文件位置
 *  2.创建一个字符缓冲输入流，在构造方法中绑定字符输入流；
 *  3.创建一个FileWriter字符输出流，内存到对象，构造器提供目标文件位置
 *  4.创建一个字符缓冲输出流，在构造方法中绑定字符输出流
 *  5.使用字符缓冲输入流中的readline方法逐行读取文本
 *  5.对文件中的内容进行正则拆分
 *  6.将拆分后的文件内容存储到HashMap集合中
 *  7.遍历集合，并使用字符缓冲输出流写数据 
 *  8.关闭资源
 */
public class Demo03Sort {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\SVN\\Code_Gallagher.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("E:\\SVN\\Result.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		HashMap<String,String> map = new HashMap<String, String>();
		String line ;
		while((line = br.readLine()) != null) {
			String[] arr = line.split("\\.");
			map.put(arr[0],arr[1]);//这里因为一次取一个数组，数组中有两个值。对应0和1
		}
		for(String key : map.keySet()) {//这里返回的是map集合的所有键的Set集合！！！注意是集合，不是String类型，详情见Demo04Test
			String value = map.get(key);
			line = key + "." + value;
			System.out.println(key);		 
			bw.write(line);
			bw.newLine();
		}  
		bw.close(); 
		br.close();
	}
		
}
