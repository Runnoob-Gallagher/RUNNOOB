package Ϲ���Ѳ���;

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
		
		File fileA = new File("D:\\BBSJ\\ͳһ������֤����\\V1.0.00001.231.12013.01\\GT3-SBFGL-V1.0.00001.231.12013.LT2�汾\\GT3-SBFGL-V1.0.00001.231.12013.L2-�汾����������\\1-���ݿ�������\\V1.0.013-patch1-LT2\\1-���ݿ�һ�������ű�\\V1.0.013-patch1");
		boolean a = fileA.exists();
		System.out.println(a);
		System.out.println(fileA);
		File fileB = new File("D:\\BBSJ\\ͳһ������֤����\\V1.0.00001.231.12013.01\\GT3-SBFGL-V1.0.00001.231.12013.LT2�汾\\GT3-SBFGL-V1.0.00001.231.12013.L2-�汾����������\\1-���ݿ�������\\V1.0.013-patch1-LT2\\1-���ݿ�һ�������ű�\\V1.0.013-patch1", "config.inin");
		System.out.println(fileB);
		boolean b = fileB.exists();
		System.out.println(b);
	}
}
