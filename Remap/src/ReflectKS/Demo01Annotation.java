package ReflectKS;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@SuppressWarnings("all")  �����һ����ѹ���棬�Ѿ�����Ϣ���ų���
/*
 * Ԫע�⣺���ƽ�������ע���ע��
 * @Target����������ע������÷�Χ
 * @Retention����ʾ��Ҫ��ʲô���𱣴��ע����Ϣ����������ע����������ڣ�SOURCE<CLASS<RUNTIME)
 * @Document��˵����ע�⽫��������javadoc��
 * @Inherited��˵��������Լ̳и����еĸ�ע��
 */
//����Ԫע��
public class Demo01Annotation {
	@MyAnnotation
	public void test() {
		System.out.println("���ǲ���Ԫע���");
	}
}
//����һ��ע��
@Documented   //��ʾ�Ƿ�ע��������javadoc��
@Retention(value = RetentionPolicy.RUNTIME) //��ʾע����ʲô�ط�����Ч��SOURCE-��Դ�뼶�����Ч CLASS-��������Ч RUNTIME-���еط�����Ч
											//RUNTIME > CLASS > SOURCE
@Target(value = {ElementType.METHOD,ElementType.TYPE}) //���÷�Χ�޶��ڷ�����,��������
@interface MyAnnotation{
	
}
