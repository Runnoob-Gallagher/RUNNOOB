package cn.zj.cq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//这个Demo是计算输入的字符串中相同字母出现的个数
/*实现步骤：
	1.接收输入
	2.将输入转为字符型
	3.存入到集合中
	4.*/
public class Demo07Count {
	public static void main(String[] args) {
		//处理用户输入
		System.out.println("请输入一个字符串：");
		Scanner scan = new Scanner(System.in);
		String strA = scan.nextLine();
		//创建HashMap集合用来存储元素，key是字符串中的知乎，value是重复的次数
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		for(char c : strA.toCharArray()) {
			if(mapA.containsKey(c)) { 
				Integer value = mapA.get(c);
				System.out.println(value);
			}else {   
				mapA.put(c,1);
			}     
		}          
		System.out.println(mapA);
	}
}
