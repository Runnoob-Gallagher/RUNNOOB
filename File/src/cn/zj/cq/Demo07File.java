package cn.zj.cq;

import java.io.File;

//这个demo是用匿名内部类甚至lambda表达式去实现FileFilter
public class Demo07File {
	public static void main(String[] args) {
		File file = new File("E:\\SVN");
		methodA(file);
	}

	private static void methodA(File file) { 
		// TODO Auto-generated method stub
		File[] fileA = file.listFiles(new Demo07FileImp()); //<-----匹配规则返回来的File对象
		for(File fileB:fileA) {
				methodA(fileB); 
			}
			  
		}

	}

