package �ַ�;

import java.io.FileWriter;
import java.io.IOException;

/*
 	���췽����
 	
 	FileOutputStream(String name, boolean append) 
          ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ�����
    
    ����ժҪ��
    
     void write(byte[] b)  �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С� 
     void write(byte[] b, int off, int len)  ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ�������� 
 	 void write(int b)  ��ָ���ֽ�д����ļ�������� 
	
  ���з��ţ�
  		win:\r\n
  		Linux:/r
  		mac:/n
 */
public class Demo04FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\SVN\\Runoob"/*,true*/);//֮ǰ��û��true��д��һ�顣Ȼ�����true�������ȫ��׷��һ��
		char[] ch = {'��','��','��','��','��','��','��','ѧ','ϰ'};//ע���ַ�����ĸ�ʽ��
		fw.write(ch);
		fw.flush();
		fw.write(97);
		fw.append('׷');//�������ֱ��׷��
		fw.write("��Ŀ���д�ַ����𣿺�����Ŀ��ԚG");
		fw.write("\r\n");
		fw.write(ch,1,2);//����Ӧ����д����࣬��ʾ��һ����ʼд(��ʼ������0��������0-�ң�1-�����д�� )��д���� 
		fw.write("�����",1,2);//���������д�����
		fw.close();
	}
}
