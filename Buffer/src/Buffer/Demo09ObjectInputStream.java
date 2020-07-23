package Buffer;
//这个的demo暂定  还有不能解决的问题

//针对InvalidClassException问题：因为Person类实现了Serializable接口，所以会根据类中的定义的属性及方法在Personclass文件中生成一个序列号，
/*	进行序列化之后还会再生成的文本文件中生成一个序列号，在进行反序列化的时候会将这两个值进行比较，如果相同就进行反序列化操作。
	如果变化了Person对象中的内容，那么就会重新生成新的序列号，这个时候不进行序列化操作，直接进行反序列化操作，这个时候，
	新生成的序列号和之前的生成的文本文件不一致，就会提示报错 -------》
	序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联，该序列号在反序列化过程中用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。
	如果接收者加载的该对象的类的 serialVersionUID 与对应的发送者的类的版本号不同，则反序列化将会导致 InvalidClassException。
	可序列化类可以通过声明名为 "serialVersionUID" 的字段（该字段必须是静态 (static)、最终 (final) 的 long 型字段）显式声明其自己的 serialVersionUID：
	ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;

	只需要在Person类中手动加一个序列号*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;

/*public class ObjectInputStream extends InputStream;
	ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。 
	ObjectOutputStream 和 ObjectInputStream 分别与 FileOutputStream 和 FileInputStream 一起使用时，可以为应用程序提供对对象图形的持久存储。ObjectInputStream 用于恢复那些以前序列化的对象。
	readObject 方法用于从流读取对象*/
public class Demo09ObjectInputStream {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		methodA();
		methodB();
	}

	private static void methodB() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\SVN\\Object");
		ObjectInputStream ois = new ObjectInputStream(fis);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Object obj;
		obj = ois.readObject();
		Person p = (Person)obj;
		hm.put(p.getName(),p.getAge());
		Set<String> name = hm.keySet();
		System.out.println(hm.get(name));
	}

	private static void methodA() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\SVN\\Object");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj;
		obj = ois.readObject();
		Person p = (Person)obj; 
		System.out.println(p);
		System.out.println(p.getAge() + " " +p.getName() );
		/*
		 * while(((Person)(obj = ois.readObject())).getName()!= null) {
		 * System.out.println(obj); }
		 */
		ois.close();	
	}
}
//在进行序列化的时候遇到Exception in thread "main" java.io.EOFException//因为文件读完还在继续，发生该错误
/*
 * 解决办法有三： 	1.添加一个null对象，循环进行判断
 *  			2.将读取粗来的文件放到集合中 
 *  			3.将读取出来的文件放到数组中   记住下次解决
 */
