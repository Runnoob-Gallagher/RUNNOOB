package cn.zj.cq;

import java.io.File;

//���demo���������ڲ�������lambda���ʽȥʵ��FileFilter
public class Demo07File {
	public static void main(String[] args) {
		File file = new File("E:\\SVN");
		methodA(file);
	}

	private static void methodA(File file) { 
		// TODO Auto-generated method stub
		File[] fileA = file.listFiles(new Demo07FileImp()); //<-----ƥ����򷵻�����File����
		for(File fileB:fileA) {
				methodA(fileB); 
			}
			  
		}

	}

