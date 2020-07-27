package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(0222);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();
		int len=0;
		byte[] by = new byte[1024]; 
		len=is.read(by);
		System.out.println(new String(by,0,len));
		OutputStream os = socket.getOutputStream();
		os.write("Day Day Up".getBytes());
		socket.close();
		ss.close();
	}
}
