package Buffer;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*public class PrintStream extends OutputStream;PrintStream Ϊ�������������˹��ܣ�ʹ�����ܹ�����ش�ӡ��������ֵ��ʾ��ʽ��
�����ṩ��������ܡ��������������ͬ��PrintStream ��Զ�����׳� IOException��*/
public class Demo11Print {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("E:\\SVN\\Print");
		ps.write(97);
		ps.print(97);
		ps.close();
	}
}
