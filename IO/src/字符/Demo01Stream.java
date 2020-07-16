package ×Ö·û;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01Stream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Repository\\IO\\Test");
		int len = 0;
		while((len = fis.read())!=-1) {
			System.out.println(len);
		}
	}
}
