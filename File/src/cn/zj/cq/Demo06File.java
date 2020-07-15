package cn.zj.cq;
//���demo����Ϥ�ӿ�FileFilter�ͽӿ�FilenameFilter
/*
FileFilter��    ------�� �ص㣺�˽ӿڵ�ʵ���ɴ��ݸ� File ��� listFiles(FileFilter) ������ 
	�ýӿ������ڳ���·�����Ĺ�������û��ʵ���࣬��Ҫ�Լ���д�ӿڵ�ʵ����Ȼ����÷�����
	boolean accept(File pathname)  ����ָ������·�����Ƿ�Ӧ�ð�����ĳ��·�����б��С� 
FilenameFilter:
	ʵ�ִ˽ӿڵ���ʵ�������ڹ������ļ�����ͬ��û��ʵ����
	boolean accept(File dir, String name) ����ָ���ļ��Ƿ�Ӧ�ð�����ĳһ�ļ��б��С� 
	ע�⣺
	��File���б�������������ListFiles���صķ����������������ݵ��ǹ�������
	
	 File[] listFiles(FileFilter filter) 
     ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� 
File[] listFiles(FilenameFilter filter) 
     ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� */

import java.io.File;

public class Demo06File {
	public static void main(String[] args) {
			File file = new File("E:\\SVN");
			methodA(file);
			
		}

		private static void methodA(File file) {
			// TODO Auto-generated method stub
			File[] fileA = file.listFiles(new Demo06FileImp());//�����洫�ݵ��Ƕ���������ʵ���ࣩ----���˽ӿڵ�ʵ���ɴ��ݸ� File ��� listFiles(FileFilter) ������ 
			for(File fileB : fileA) {
				if(fileB.isFile()) {  //����������FileFilterȥɸѡ��Ҫ���ļ������ǽӿڲ���ֱ�ӵ��÷����������½�һ��ʵ����ȥ��д����
					System.out.println(fileB.getName());
				}else if(fileB.isDirectory()) {
					methodA(fileB.getAbsoluteFile());
				}
			}
		}
	}

