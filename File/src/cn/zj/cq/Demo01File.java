package cn.zj.cq;

import java.io.File;

public class Demo01File {
	public static void main(String[] args) {
		
		//��ӡ�ָ����ͷֺ�   ��Ϊ�Ǿ�̬�ģ�ֱ����File��
	  /*static String pathSeparator   		��ϵͳ�йص�·���ָ�����Ϊ�˷��㣬������ʾΪһ���ַ����� 
        static char pathSeparatorChar 		��ϵͳ�йص�·���ָ����� 
        static String separator 	  		��ϵͳ�йص�Ĭ�����Ʒָ�����Ϊ�˷��㣬������ʾΪһ���ַ����� 
        static char separatorChar     		��ϵͳ�йص�Ĭ�����Ʒָ�����*/
		String pathSeparatorA = File.pathSeparator;
		System.out.println("�ַ������Ƶķֺ�    " + pathSeparatorA);
		char pathSeparatorB = File.pathSeparatorChar;
		System.out.println("�ַ���ʽ�ķֺ�   " + pathSeparatorB);
		String separatorC = File.separator;  //ע����win�зָ����� \  ��linux����  /
		System.out.println("�ַ�����ʽ�ķָ���    " + separatorC);
		char separatorD = File.separatorChar;
		System.out.println("�ַ���ʽ�ķָ���    " + separatorD);
	}
}
