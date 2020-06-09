package cn.zj.cq;

import java.util.HashMap;

//这个demo是测试Integer value = mapA.get(c);  这个是什么意思
public class test {
public static void main(String[] args) {
	HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
	String strA = "assssdddaaas";
	char[] chA =  strA.toCharArray();
	for(int i = 0;i < chA.length; i++) {
		if(mapA.containsKey(chA[i])) {
			int value = mapA.get(chA[i]);
			value++;
	 		mapA.put(chA[i], value);
		}else {
			mapA.put(chA[i], 1);
		}
	} 
	System.out.println(mapA);
} 
}  
