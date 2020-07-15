package cn.zj.cq;

import java.io.File;
import java.io.FileFilter;
//FileFilter实现原理
/*当ListFile方法会对构造器传递过来的目录进行遍历，获取目录中每一个文件/文件夹---->封装为File对象；
ListFile方法然后会调用参数传递的过滤器中的方法accept
ListFiles方法会把遍历得到的每一个每一个File对象，传递到accept方法的参数pathname。
根据accept方法中的匹配规则，返回一个boolean值。
如果返回的是true，那么就把这个对象存放到File[]数组中去，然后遍历得出结果；*/
public class Demo06FileImp implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		if(pathname.isDirectory()) {
			return true;//如果是文件夹的话，再走一遍流程
		}
		return pathname.getName().toLowerCase().endsWith(".txt"); 
	}

}
