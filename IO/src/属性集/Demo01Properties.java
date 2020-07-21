package 属性集;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 	Java.util.Properties：Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
	public class Properties extends Hashtable<Object,Object> implements Map<Object,Object> 
	
	 void load(InputStream inStream) 从输入流中读取属性列表（键和元素对）。 
 	 void load(Reader reader) 按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
 	 
 	 load方法可以将硬盘中保存的文件（键值对），读取到集合中去
 	 
 	 void store(OutputStream out, String comments)  以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。 
 	 void store(Writer writer, String comments) 以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
     
     store方法可以将集合中的临时数据从流中加载
     
	具体的取值方法： 
		1. String getProperty(String key)  用指定的键在此属性列表中搜索属性。  通过键来获取值
		2. String getProperty(String key, String defaultValue)   用指定的键在属性列表中搜索属性。 
  		3. Object setProperty(String key, String value)    调用 Hashtable 的方法 put。 
  		4.Set<String> stringPropertyNames()   返回此属性列表中的键集，其中该键及其对应值是字符串，相当于Map集合的KeySet方法，将所有的key取出来放在一个Set集合中
 */
public class Demo01Properties {
	public static void main(String[] args) throws IOException {
		//methodA();
		methodB();
		//methodC();
	}

	private static void methodC() throws IOException {
		// TODO Auto-generated method stub
		Properties ppC = new Properties();
		FileReader fr = new FileReader("E:\\SVN\\CQ.txt");
		FileInputStream fis = new FileInputStream("E:\\SVN\\ZJ.txt");
		ppC.load(fr);
		Set<String> string = ppC.stringPropertyNames();
		for (String str : string) {
			System.out.println(str + " = " + ppC.getProperty(str));
		}
	}

	private static void methodB() throws IOException {
		// TODO Auto-generated method stub
		Properties ppB = new Properties();
		ppB.setProperty("杨", "洁");
		ppB.setProperty("黄", "玉虹");
		ppB.setProperty("E", "F");
		ppB.setProperty("G", "H"); 
		FileWriter fe = new FileWriter("E:\\SVN\\CQ.txt");
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\ZJ.txt");
		ppB.store(fos, " pp");
		ppB.store(fe, "date");
		fe.close();
	}

	private static void methodA() {
		// TODO Auto-generated method stub
		//创建properties对象，调用其中的方法；
		Properties ppA = new Properties();
		ppA.setProperty("杨洁A", "刘佩佩");
		ppA.setProperty("杨洁B", "黄玉虹");//开始全部存储的是杨洁，这样最后一个就会覆盖前面的属性值
		ppA.setProperty("杨洁C", "杨柳");
		ppA.put(1, true);//因为它继承hashtable，所以可以使用hashtable的put方法
		Set<String> set = ppA.stringPropertyNames();//将这个属性集中的键集存放在set集合中
		for (String string : set) {
			System.out.println(string + " = " + ppA.getProperty(string));//因为遍历的是string类型的，所以(1,true)是不会输出出来的
		}
	}
}
