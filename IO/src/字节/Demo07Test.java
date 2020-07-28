package ×Ö½Ú;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo07Test {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\SVN\\Gallagher");
		if(!file.exists()) {
			file.mkdir();
		}
	}	
}
