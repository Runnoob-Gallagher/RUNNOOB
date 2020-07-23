package Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*	表示客户端的类：
		public class Socket extends Object;此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
		套接字：包含IP地址和端口的网络单位；
		
		构造方法：
		Socket(String host, int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
			String host --->表示服务器主机的名称/IP地址
			int port---->服务器的端口号
		
		成员方法：
		 OutputStream getOutputStream() 返回此套接字的输出流。
		 InputStream getInputStream()  返回此套接字的输入流。
		 void close() 关闭此套接字。 ）*/
	
	/*	 实现步骤：
			1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
			2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
			3.使用网络字节输出流OutputStream对象中的write方法，给服务器发送数据
			4.使用Socket对象中的方法getInputStream(）获取网络字节输入流InputStream对象
			5.使用网络字节输入流InpuStream对象中的read方法，接收服务器回写的数据
			6.关闭资源
		
		注意：
			1.客户端和服务器交互必须使用Socket提供的网络流，不能使用自己创建的流对象
			2.当我们创建客户端对象Socket时，就会去请求服务器，和服务器进行三次握手连接通路
				如果请求失败，提示异常 */

public class Demo02Client {
		public static void main(String[] args) throws IOException {
//			1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
			Socket soc = new Socket("127.0.0.1", 2222);
//			2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
			OutputStream ops = soc.getOutputStream();
//			3.使用网络字节输出流OutputStream对象中的write方法，给服务器发送数据
			ops.write("This is My message".getBytes());
//			4.使用Socket对象中的方法getInputStream(）获取网络字节输入流InputStream对象
			InputStream ips = soc.getInputStream();
//			5.使用网络字节输入流InpuStream对象中的read方法，接收服务器回写的数据
			byte[] by = new byte[1024];
			int len = ips.read(by);
			System.out.println(new String (by,0,len));
//			6.关闭资源 
			ops.close(); //这里到底什么时候该关，关什么，先后顺序是什么
			soc.close(); 
		}
}
