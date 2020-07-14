package cn.zj.cq;

import java.io.File;
import java.io.IOException;

public class Demo02File {
	public static void main(String[] args) {
		/*���췽��ժҪ     
		File(File parent, String child) 
		          ���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 
		File(String pathname) 
		          ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ���� 
		File(String parent, String child) 
		          ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ���� */
		String parent = "E:\\SVN";
		String child = "Gallagher.txt";
		File file = new File(parent, child);
		System.out.println(file); 
		//����һ���ļ���
		//createNewfile();//�½��ļ�·�������ƶ�Ҫ�ڹ��췽����д��
		//ɾ��һ���ļ������ļ�Ŀ¼
		//delete();//ɾ�����ļ�·�������ƶ�Ҫ�ڹ��췽����д��
		//�½�һ���ļ���
		//mkdir();//�½����ļ���·��Ҫ�ڹ��췽����д��
		//�����༶�ļ���
		mkdirs();//�½����ļ���·��Ҫ�ڹ��췽����д��
		
		//�����ж�
		/*public boolean exists()` ����File��ʾ���ļ���Ŀ¼�Ƿ�ʵ�ʴ��ڡ�
		  public boolean isDirectory()` ����File��ʾ���Ƿ�ΪĿ¼��
		  public boolean isFile()` ����File��ʾ���Ƿ�Ϊ�ļ���*/
		
	}

	private static void mkdirs() {
		// TODO Auto-generated method stub
		File fileE = new File("E:\\\\SVN\\\\Code_Gallagher\\Gallagher");
		System.out.println(fileE.mkdirs());
	}

	private static void mkdir() {
		// TODO Auto-generated method stub
		File fileD = new File("E:\\SVN\\Gallagher");
		System.out.println(fileD.mkdir());
	}

	private static void delete() {
		// TODO Auto-generated method stub
		File fileB = new File("E:\\\\SVN\\\\Gallagher.txt");//�ļ�
		System.out.println(fileB.delete());//
		File fileC = new File("E:\\SVN\\Gallagher");//Ŀ¼
		System.out.println(fileC.delete());
	}

	private static void createNewfile() {//
		// TODO Auto-generated method stub
		File fileA = new File("E:\\SVN\\Gallagher.txt");
		try {
			boolean b = fileA.createNewFile();
			System.out.println(b);//���true�������ļ��ɹ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�㴴�����ļ����������⡣����·��������");
		}
		
	}

	
}
