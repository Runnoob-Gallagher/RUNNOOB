package Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Demo04Test {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\SVN\\Code_Gallagher.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("E:\\SVN\\test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String line = br.readLine();
		System.out.println(line);
		String[] arr = line.split("\\."); 
		System.out.println(arr[0] + "   " + arr[1]);
		HashMap<String,String> map = new HashMap();
		line = br.readLine(); 
		System.out.println(line);
		String[] arrA= line.split("\\."); 
		System.out.println(arrA[0] + "   " + arrA[1]);
		map.put(arrA[0], arrA[1]);
		Set<String> key = map.keySet();
		System.out.println("这里返回的是一个Set集合" + key);
		for (String string : key) {
			System.out.println(string);//所以要将集合中的值遍历出来
		} 
		System.out.println(key); 
		System.out.println(map.keySet() + " " + map.get(key));
	}
}
 