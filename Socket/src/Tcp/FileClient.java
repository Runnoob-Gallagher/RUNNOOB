package Tcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\SVN\\HYH.jpg");
		Socket socket = new Socket("127.0.0.1", 0223);
		OutputStream os = socket.getOutputStream();
		byte[] bt = new byte[1024];
		int len = 0; 
		while((len = fis.read(bt)) != -1) {
			os.write(bt,0,len);  
		} 
		InputStream is = socket.getInputStream();
		while((len = is.read(bt)) != -1) {
			System.out.println(new String(bt,0,len));
		}
//		fis.close();  
//		socket.close();
	}
} 
