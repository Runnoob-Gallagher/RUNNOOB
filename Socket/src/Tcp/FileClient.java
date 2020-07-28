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
		//这里的循环停止条件是不等于-1，但是这里的结束标记等于-1不会被读到？？？？？为什么呢
		socket.shutdownOutput();//禁用此套接字的输出流。对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
		InputStream is = socket.getInputStream();
		while((len = is.read(bt)) != -1) {
			System.out.println(new String(bt,0,len));
		}
		fis.close();  
		socket.close();
	}
} 
 