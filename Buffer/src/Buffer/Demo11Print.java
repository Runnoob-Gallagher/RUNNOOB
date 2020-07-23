package Buffer;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*public class PrintStream extends OutputStream;PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
它还提供其他两项功能。与其他输出流不同，PrintStream 永远不会抛出 IOException；*/
public class Demo11Print {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("E:\\SVN\\Print");
		ps.write(97);
		ps.print(97);
		ps.close();
	}
}
