package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;
//FileFilterʵ��ԭ��
/*��ListFile������Թ��������ݹ�����Ŀ¼���б�������ȡĿ¼��ÿһ���ļ�/�ļ���---->��װΪFile����
ListFile����Ȼ�����ò������ݵĹ������еķ���accept
ListFiles������ѱ����õ���ÿһ��ÿһ��File���󣬴��ݵ�accept�����Ĳ���pathname��
����accept�����е�ƥ����򣬷���һ��booleanֵ��
������ص���true����ô�Ͱ���������ŵ�File[]������ȥ��Ȼ������ó������*/
public class Demo06FileImp implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		if(pathname.isDirectory()) {
			return true;//������ļ��еĻ�������һ������
		}
		return pathname.getName().toLowerCase().endsWith(".txt"); 
	}

}
