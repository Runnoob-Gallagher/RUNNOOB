package cn.zj.cq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//这个demo是练习自定义类的
/*1.接收用户输入
2.使用Map集合存放已经存在的注册信息
3.通过Map集合的方法来判断信息是否存在
4.如果信息存在那么就提示报错*/
public class Demo10DefineException {
	public static void main(String[] args) throws RegisterException {
		/*
		 * Map<String, Integer> mapA = new HashMap<String, Integer>(); mapA.put("杨刚",
		 * 26); mapA.put("杨洁", 24); mapA.put("谭书记", 25); mapA.put("杨飞", 25);
		 * System.out.println("请输入你的注册姓名："); Scanner sc = new Scanner(System.in);
		 * //System.out.println(sc); //System.out.println(mapA);
		 */	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入注册姓名：");
		String name = sc.next();
		methodA(name);
		
	}
	public static void methodA(String s) throws RegisterException {
		String[] strA = {"杨洁","谭书记","辉仔","探险家"};
		for(int i=0;i<strA.length;i++) {
			if(s.equals(strA[i])) {
				throw new RegisterException("对不起，该用户已注册");
			}
		}
		System.out.println("恭喜！注册成功");
	}
}
