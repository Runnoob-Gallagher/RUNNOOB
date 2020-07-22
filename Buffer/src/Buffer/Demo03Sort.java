package Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/*
 * ��������ı���������
 *  String[] split(String regex)  ���ݸ���������ʽ��ƥ���ִ��ַ��� 
 *  HashMap�������ݺ󣬻��Զ���������ĸ����
 *  String readLine() 
          ��ȡһ���ı��С� 
 *  
 *  �������裺
 *  1.����һ��FileReader�ַ������������������ڴ棻�ڹ��������ṩ�ַ���������Ŀ���ļ�λ��
 *  2.����һ���ַ��������������ڹ��췽���а��ַ���������
 *  3.����һ��FileWriter�ַ���������ڴ浽���󣬹������ṩĿ���ļ�λ��
 *  4.����һ���ַ�������������ڹ��췽���а��ַ������
 *  5.ʹ���ַ������������е�readline�������ж�ȡ�ı�
 *  5.���ļ��е����ݽ���������
 *  6.����ֺ���ļ����ݴ洢��HashMap������
 *  7.�������ϣ���ʹ���ַ����������д���� 
 *  8.�ر���Դ
 */
public class Demo03Sort {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\SVN\\Code_Gallagher.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("E:\\SVN\\Result.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		HashMap<String,String> map = new HashMap<String, String>();
		String line ;
		while((line = br.readLine()) != null) {
			String[] arr = line.split("\\.");
			map.put(arr[0],arr[1]);//������Ϊһ��ȡһ�����飬������������ֵ����Ӧ0��1
		}
		for(String key : map.keySet()) {//���ﷵ�ص���map���ϵ����м���Set���ϣ�����ע���Ǽ��ϣ�����String���ͣ������Demo04Test
			String value = map.get(key);
			line = key + "." + value;
			System.out.println(key);		 
			bw.write(line);
			bw.newLine();
		}  
		bw.close(); 
		br.close();
	}
		
}
