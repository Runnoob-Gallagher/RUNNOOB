package ReflectKS;
/*
 * ������������ã����ֽ����ļ�.class���ؽ��ڴ��У�JAVA�������¼�����
 * Bootstap Classloader ���������������C++��д��ʱJVM�Դ����������������JAVAƽ̨���ҿ࣬����װ�غ��Ŀ��࣬�ļ������޷�ֱ�ӻ�ȡ��rt.jar
 * 
 * Extension Classloader ��չ�������������jre/lib/extĿ¼�µ�jar����-D java.ext.dirsָ��Ŀ¼�µ�jar��װ�빤����
 * 
 * System Classloader ϵͳ�������������java -classpath �� -D java.class.path��ָ��Ŀ¼�µ�����jar��װ�빤������õļ�����
 * 
 * �Ե����ϼ�����Ƿ���װ�أ��Զ����³��Լ�����
 */
/*
 * ˫��ί�ɻ��ƣ�
 *  ��һ��һ�������ң������Լ�����һ��java.lang.String�࣬�������������ң��ҵ�֮�����Լ������û����
 *  ���ؼ�Ᵽ֤��ȫ��
 */
public class Demo06ClassLoader {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡϵͳ��ļ�����
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
		//��ȡϵͳ��������ĸ��������---����չ�������
		ClassLoader parentA = systemClassLoader.getParent();
		System.out.println(parentA);//sun.misc.Launcher$ExtClassLoader@5ce65a89
		//��ȡ��չ��������ĸ��������--->��������
		ClassLoader parentB = parentA.getParent();
		System.out.println(parentB);//null   C/C++��д����ȡ����
		//�鿴��ǰ��ļ�����
		ClassLoader current = Class.forName("ReflectKS.Demo06ClassLoader").getClassLoader();
		System.out.println(current);//sun.misc.Launcher$AppClassLoader@18b4aac2   ϵͳ������
		//�鿴JDK������ļ�����
		ClassLoader Inner = Class.forName("java.lang.Object").getClassLoader();
		System.out.println(Inner); //null  ��������
		//��ȡϵͳ����������Լ��ص�·��
		System.out.println(System.getProperty("java.class.path"));
		/*
		 * ִ�н����   /eclipse��һ��������
		 * E:\Repository\Remap\bin;
		 * E:\Eclipse\eclipse-java-2020-03-R-win32-x86_64\eclipse\plugins\org.junit_4.13.0.v20200204-1500.jar;
		 * E:\Eclipse\eclipse-java-2020-03-R-win32-x86_64\eclipse\plugins\org.hamcrest.core_1.3.0.v20180420-1519.jar;
		 * E:\Eclipse\eclipse-java-2020-03-R-win32-x86_64\eclipse\configuration\org.eclipse.osgi\454\0\.cp\jacocoagent.jar

		 */
	}
}
