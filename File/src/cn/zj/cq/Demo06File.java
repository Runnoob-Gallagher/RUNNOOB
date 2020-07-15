package cn.zj.cq;
//这个demo是熟悉接口FileFilter和接口FilenameFilter
/*
FileFilter：    ------》 重点：此接口的实例可传递给 File 类的 listFiles(FileFilter) 方法。 
	该接口是用于抽象路径名的过滤器。没有实现类，需要自己重写接口的实现类然后调用方法；
	boolean accept(File pathname)  测试指定抽象路径名是否应该包含在某个路径名列表中。 
FilenameFilter:
	实现此接口的类实例可用于过滤器文件名。同样没有实现类
	boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。 
	注意：
	在File类中本来就有两个和ListFiles重载的方法，方法参数传递的是过滤器；
	
	 File[] listFiles(FileFilter filter) 
     返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。 
File[] listFiles(FilenameFilter filter) 
     返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。 */

import java.io.File;

public class Demo06File {
	public static void main(String[] args) {
			File file = new File("E:\\SVN");
			methodA(file);
			
		}

		private static void methodA(File file) {
			// TODO Auto-generated method stub
			File[] fileA = file.listFiles(new Demo06FileImp());//这里面传递的是多滤器对象（实现类）----》此接口的实例可传递给 File 类的 listFiles(FileFilter) 方法。 
			for(File fileB : fileA) {
				if(fileB.isFile()) {  //这里我想用FileFilter去筛选想要的文件，但是接口不能直接调用方法，所以新建一个实现类去重写方法
					System.out.println(fileB.getName());
				}else if(fileB.isDirectory()) {
					methodA(fileB.getAbsoluteFile());
				}
			}
		}
	}

