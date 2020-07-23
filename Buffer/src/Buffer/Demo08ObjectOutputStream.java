package Buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*  ���忴API�ĵ�
 ��һ���ֽ����п��Ա�ʾһ�����󣬸��ֽ����а�����`���������`��`���������`��`�����д洢������`����Ϣ��
 --->ͨ�׵���˵�������������ķ�ʽд�뱣�浽�ļ��У���д����Ҳ�ж�������л�
 ObjectOutputStream �� Java ����Ļ����������ͺ�ͼ��д�� OutputStream������ʹ�� ObjectInputStream ��ȡ���ع�������
 ͨ��������ʹ���ļ�����ʵ�ֶ���ĳ־ô洢��������������׽����������������һ̨�����ϻ���һ���������ع����� 
ֻ�ܽ�֧�� java.io.Serializable �ӿڵĶ���д�����С�ÿ�� serializable ������඼�����룬
�������ݰ�����������ǩ����������ֶ�ֵ������ֵ���Լ��ӳ�ʼ���������õ��������ж���ıհ��� 
	���췽��ժҪ��
		ObjectOutputStream(OutputStream out) ����д��ָ�� OutputStream �� ObjectOutputStream��
 */
	/*���裺1.����һ��ObjectOutputStream���󣬹��췽����ָ��Ŀ���ļ�
		2.���ö����WriteObject�������������
		3.�ر���Դ*/
		 
public class Demo08ObjectOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Object");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Person("���",24)); 
		oos.writeObject(new Person("������",25));//�ⲿ���Ǵ���ڶ��еģ��������Ƕ���
		oos.writeObject(new Person("�����",22));
		oos.writeObject(new Person()); 
		oos.close();
	}
	//����Ľ�����б���Exception in thread "main" java.io.NotSerializableException: Buffer.Person
	//��Ϊǰ��˵��ֻ�ܽ�֧�� java.io.Serializable �ӿڵĶ���д�����С�����Person����������ʵ��
//	��ʵ����Ҫ�������л��ӿ�ʱ���׳����쳣�����л�����ʱ��ʵ��������׳����쳣��
}