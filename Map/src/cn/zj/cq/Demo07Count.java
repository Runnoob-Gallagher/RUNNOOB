package cn.zj.cq;
//这个demo是计算输入的字符串中的相同字母的个数----结合test一起看
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//这个Demo是计算输入的字符串中相同字母出现的个数
/*实现步骤：
	1.接收输入
	2.创建一个HashMap类用以储存元素，其中key是输入的元素，value是出现的次数
	3.遍历输入的元素，并判断出现的次数
	4.*/
public class Demo07Count {
	public static void main(String[] args) {
		//处理用户输入
		System.out.println("请输入一个字符串：");
		Scanner scan = new Scanner(System.in);
		String strA = scan.nextLine();
		//创建HashMap集合用来存储元素，key是字符串中的输入，value是重复的次数
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		for(char c : strA.toCharArray()) {//???这里是怎么进行转换的，我什么我直接转换却不行
			if(mapA.containsKey(c)) { 
				Integer value = mapA.get(c);//②然后找到一个重复的，因为第一步已经有了(c,1)就得到value为1
				value++;//这里的就是发现了一个重复的就加1;
				mapA.put(c, value);//然后将新的值写入到集合中
			}else {   
				mapA.put(c,1);//①首先元素肯定是不存在的，肯定都是先执行else。得到(c,1)；
			}     
		}          
		System.out.println(mapA);
	}
}
