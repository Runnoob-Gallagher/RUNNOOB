package Tcp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(0223);
//		ss.close(); 
		while(true) {
			Socket socket = ss.accept(); 
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						InputStream is = socket.getInputStream();
						String filename = "TcpServer" + System.currentTimeMillis() + new Random().nextInt(9999) + ".jpg";
						FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher\\" + filename);
						byte[] bt = new byte[1024];
						int len = 0; 
						while((len = is.read(bt))!=-1) {
							fos.write(bt); 
						}
						OutputStream os = socket.getOutputStream();
						os.write("上传成功".getBytes());
						fos.close();
						socket.close();
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					
				}
			}).start();
		
		}
		   
//		ss.close();
} 
}