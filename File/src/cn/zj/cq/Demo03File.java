package cn.zj.cq;

import java.io.File;

public class Demo03File {
	public static void main(String[] args) {
		File fileA = new File("E:\\SVN");
		System.out.println(fileA.getAbsolutePath());//��ȡ��Ŀ¼�ľ���·��
		File fileB = new File("Gallagher.txt");//����ļ��ҷ��ڸĹ������·������,ע���ǹ��̵�·�������Ǹ�demo��·��
		System.out.println(fileB.getAbsolutePath());//��ȡ���ļ��ľ���·��
		System.out.println(fileB.getPath());//�����ļ����ƻ���·������
		System.out.println(fileB.length());//��ȡ���ļ��Ĵ�С
	}
}
 