package cn.zj.cq;

import java.io.FileNotFoundException;
import java.io.IOException;

//���demo�Ǵ���ע���Ǳ������������������쳣�ĵ�һ�ַ�ʽ---->throws  ��������ȥ����
/*���ã�
	�������ڲ��׳�����쳣ʱ�����Ǿͱ��봦������쳣����
	�Ϳ���ʹ��throws�ؼ��ִ����쳣���󣬰��쳣���������׸������ĵ����ߴ����Լ��������������˴������ս���JVM����
��ʽ���ڷ�������ʱʹ��
	���η� ����ֵ���� ������(�����б�) throws AAAException,BBBException{
		throw new AAAException("����ԭ��");
		throw new BBBException("����ԭ��");
		...
}
ע�⣺
	throws�ؼ��ֱ���ж�ط���������
	throws�ؼ��ֺ���������쳣������Exception������Exception������
	�����ڲ�����׳�����쳣����ôthrows��߱���Ҳ�Ƕ���쳣
	����һ�������ų��쳣�ķ��������Ǿͱ��봦���������쳣
		Ҫô����ʹ��throws�����׳������������ĵ����ߴ������ս���JVM
		Ҫôtry...catch�Լ������쳣*/

//����׳����쳣���Ӹ����ϵ������ֱ����������һ������
public class Demo05DoException {  //ע������쳣�ͱ���ʹ��throws�׳��쳣
	public static void main(String[] args) throws FileNotFoundException,IOException {//FileNotFoundException�̳�IOException ���Բ���ǰ�ߣ�ֱ��ʹ�ø���
		methodA("D:/ext");
	}
	public static void methodA(String str) throws IOException {
		String filepath = "D:/text";
		if(!filepath.endsWith(".test")) {
			throw new IOException("��׺������");
		}
		if(!str.equals(filepath)) { //if(str != filepath) 
			throw new FileNotFoundException("����ļ�·��������Ӵ");
		}
		
	}
}

