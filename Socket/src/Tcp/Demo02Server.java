package Tcp;

	import java.io.IOException;
/*public class ServerSocket extends Object 此类实现服务器套接字。服务器套接字等待请求通过网络传入;
	
	构造方法：
	ServerSocket(int port) 创建绑定到特定端口的服务器套接字。---->因为客户端发送过来之前已经确定好版本号了
	
	方法摘要 
	 InputStream accept()  侦听并接受到此套接字的连接。 ---->用以明确哪个客户端发送的请求 
	 
	 步骤：
	 	1.创建一个服务端对象ServerSocket,构造方法绑定客户端服务器的端口号
		2.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
		3.使用网络字节输入流InputStream对象中的read方法，读取客户端发送过来的消息 
		4.使用Socket对象中的方法getOutputStream(）获取网络字节输出流OutputStream对象
		5.使用网络字节输入流OutpuStream对象中的write方法，将服务器的信息回写到客户端
		6.关闭资源*/
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2222);
		Socket soc = ss.accept();
		InputStream ips = soc.getInputStream();
		byte[] by = new byte[1024];
		int len = ips.read(by);
		System.out.println(new String (by,0,len));
		 OutputStream oup = soc.getOutputStream();
		 oup.write("Copy That".getBytes());
		 soc.close();
		 ss.close();
	}  
}
