package cn.zj.cq;

import java.io.File;
/*String[] list() 
����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�� */
public class Demo04File {
	public static void main(String[] args) {
		File fileA = new File("E:\\SVN");
		String[] file = fileA.list();
		for(String fileB : file) { 
			System.out.println(fileB);
		}              //----------------����������������Ƿ��ص����Ͳ�ͬһ����String���ͣ�һ����File����
/*File[] listFiles() 
         ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���*/
		File[] fileB = fileA.listFiles();
		for(File fileC: fileB) {
			System.out.println(fileC);
		}
	}
}
