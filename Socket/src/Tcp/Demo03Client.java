package Tcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo03Client {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\SVN\\app.war");
		Socket socket = new Socket("127.0.0.1", 8789);
		OutputStream os = socket.getOutputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while((len = fis.read(by)) != -1) {
			os.write(by,0,len);
		} 
		socket.shutdownOutput(); 
		InputStream is = socket.getInputStream();
		while((len = is.read(by)) != -1) {
			System.out.println(new String(by,0,len));
		}
		socket.shutdownInput();
		fis.close(); 
		socket.close();
	}  
}
