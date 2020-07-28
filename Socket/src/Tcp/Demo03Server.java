package Tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random; 

public class Demo03Server {
	public static void main(String[] args) throws IOException {
			 FileOutputStream fos = null ;
			ServerSocket server = new ServerSocket(8789);
			while(true) {
			Socket socket = server.accept();
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						InputStream is = socket.getInputStream();
						String filename = "Socket" + System.currentTimeMillis() + new Random().nextInt();
						File file = new File("E:\\SVN\\Gallagher");//这里的建目录一定要在FileOutPutStream之前。没有目录怎么行嘛
						if(!file.exists()) {  
							file.mkdirs();     
						}
						FileOutputStream fos = new FileOutputStream("E:\\SVN\\Gallagher\\" + filename + ".war");
						byte[] by = new byte[1024]; 
						int len=0;
						while((len = is.read(by)) != -1) {
							fos.write(by);
						}    
						socket.shutdownInput();
						OutputStream os = socket.getOutputStream();
						os.write("老子收到你的消息".getBytes());
						socket.shutdownOutput();
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}finally {
						try {
							fos.close(); 
							socket.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				}
			).start();
			
		
//		server.close(); 
	}
}
}
