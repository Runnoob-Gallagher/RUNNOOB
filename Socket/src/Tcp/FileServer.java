package Tcp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(0223);
		Socket socket = ss.accept(); 
		InputStream is = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher\\HYH.jpg");
		byte[] bt = new byte[1024];
		int len = 0; 
		while((len = is.read(bt))!=-1) {
			fos.write(bt); 
		OutputStream os = socket.getOutputStream();
		os.write("上传成功".getBytes());
//		fos.close();
//		socket.close();   
//		ss.close(); 
	}
} 
}