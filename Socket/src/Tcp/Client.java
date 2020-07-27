package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 0222);
		OutputStream os = socket.getOutputStream();
		os.write("Good Good Study".getBytes()); 
		InputStream is = socket.getInputStream();
		byte[] bt = new byte[1024];
		int len=is.read(bt);
		System.out.println(new String(bt,0,len));
		socket.close();
	}
}
 