package Buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*  具体看API文档
 用一个字节序列可以表示一个对象，该字节序列包含该`对象的数据`、`对象的类型`和`对象中存储的属性`等信息。
 --->通俗的来说，将对象以流的方式写入保存到文件中，叫写对象，也叫对象的序列化
 ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream。可以使用 ObjectInputStream 读取（重构）对象。
 通过在流中使用文件可以实现对象的持久存储。如果流是网络套接字流，则可以在另一台主机上或另一个进程中重构对象。 
只能将支持 java.io.Serializable 接口的对象写入流中。每个 serializable 对象的类都被编码，
编码内容包括类名和类签名、对象的字段值和数组值，以及从初始对象中引用的其他所有对象的闭包。 
	构造方法摘要：
		ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
 */
	/*步骤：1.创建一个ObjectOutputStream对象，构造方法中指定目标文件
		2.调用对象的WriteObject方法，传入对象
		3.关闭资源*/
		 
public class Demo08ObjectOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\SVN\\Object");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Person("杨洁",24)); 
		oos.writeObject(new Person("刘佩佩",25));//这部分是存放在堆中的，所以这是对象
		oos.writeObject(new Person("黄玉虹",22));
		oos.writeObject(new Person()); 
		oos.close();
	}
	//输出的结果会有报错：Exception in thread "main" java.io.NotSerializableException: Buffer.Person
	//因为前面说到只能将支持 java.io.Serializable 接口的对象写入流中。所以Person对象必须进行实现
//	当实例需要具有序列化接口时，抛出此异常。序列化运行时或实例的类会抛出此异常。
}