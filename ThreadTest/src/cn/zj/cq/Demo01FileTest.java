package cn.zj.cq;

import java.io.File;

public class Demo01FileTest {

		public static void main(String[] args) {
			String pathSeparatorA = File.pathSeparator;
			System.out.println(pathSeparatorA);
			char pathSeparatorB = File.pathSeparatorChar;
			System.out.println(pathSeparatorB);
			String SeparatorA = File.separator;
			System.out.println(SeparatorA); 
			char SeparatorB = File.separatorChar;
			System.out.println(SeparatorB);
		}
	}

