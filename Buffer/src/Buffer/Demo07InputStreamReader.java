package Buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 public class InputStreamReader extends Reader;InputStreamReader ���ֽ���ͨ���ַ�����������
 ��ʹ��ָ���� charset ��ȡ�ֽڲ��������Ϊ�ַ�(�ѿ������ģ���Ϊ������)����ʹ�õ��ַ�������������ָ������ʽ���������߿��Խ���ƽ̨Ĭ�ϵ��ַ����� 

ÿ�ε��� InputStreamReader �е�һ�� read() �������ᵼ�´ӵײ���������ȡһ�������ֽڡ����ļ��б���Ķ����ֽڣ�
Ҫ���ô��ֽڵ��ַ�����Чת����������ǰ�ӵײ�����ȡ������ֽڣ�ʹ�䳬�����㵱ǰ��ȡ����������ֽڡ� 

	���췽��ժҪ 
		InputStreamReader(InputStream in) ����һ��ʹ��Ĭ���ַ����� InputStreamReader�� 
		InputStreamReader(InputStream in, String charsetName) ����ʹ��ָ���ַ����� InputStreamReader��
	���췽���еı�������Ҫ���ļ��е�һ�£������������룻
 */
public class Demo07InputStreamReader {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\SVN\\Writer");
		InputStreamReader isr = new InputStreamReader(fis/* ,"utf-8" */);
		int len = 0;
		while((len = isr.read()) != -1) {
			System.out.println((char)len);
		}
		isr.close();
	}
}
