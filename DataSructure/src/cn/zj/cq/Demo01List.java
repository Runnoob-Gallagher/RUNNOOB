package cn.zj.cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	 /*
	     java.util.List�ӿ� extends Collection�ӿ�
	     List�ӿڵ��ص�:
	         1.����ļ���,�洢Ԫ�غ�ȡ��Ԫ�ص�˳����һ�µ�(�洢123 ȡ��123)
	         2.������,������һЩ�������ķ���
	         3.����洢�ظ���Ԫ��

	     List�ӿ��д������ķ���(����)
	         - public void add(int index, E element): ��ָ����Ԫ�أ���ӵ��ü����е�ָ��λ���ϡ�
	         - public E get(int index):���ؼ�����ָ��λ�õ�Ԫ�ء�
	         - public E remove(int index): �Ƴ��б���ָ��λ�õ�Ԫ��, ���ص��Ǳ��Ƴ���Ԫ�ء�
	         - public E set(int index, E element):��ָ��Ԫ���滻������ָ��λ�õ�Ԫ��,����ֵ�ĸ���ǰ��Ԫ�ء�
	     ע��:
	         ����������ʱ��,һ��Ҫ��ֹ����Խ���쳣
	         IndexOutOfBoundsException:����Խ���쳣,���ϻᱨ
	         ArrayIndexOutOfBoundsException:��������Խ���쳣
	         StringIndexOutOfBoundsException:�ַ�������Խ���쳣
	  */
	 public class Demo01List {
	     public static void main(String[] args) {
	         //����һ��List���϶���,��̬
	         List<String> list = new ArrayList<>();
	         //ʹ��add���������������Ԫ��
	         list.add("a");
	         list.add("b");
	         list.add("c");
	         list.add("d");
	         list.add("a");
	         //��ӡ����
	         System.out.println(list);//[a, b, c, d, a]  ���ǵ�ַ��д��toString

	         //public void add(int index, E element): ��ָ����Ԫ�أ���ӵ��ü����е�ָ��λ���ϡ�
	         //��c��d֮�����һ��itheima
	         list.add(3,"itheima");//[a, b, c, itheima, d, a]
	         System.out.println(list);

	         //public E remove(int index): �Ƴ��б���ָ��λ�õ�Ԫ��, ���ص��Ǳ��Ƴ���Ԫ�ء�
	         //�Ƴ�Ԫ��
	         String removeE = list.remove(2);
	         System.out.println("���Ƴ���Ԫ��:"+removeE);//���Ƴ���Ԫ��:c
	         System.out.println(list);//[a, b, itheima, d, a]

	         //public E set(int index, E element):��ָ��Ԫ���滻������ָ��λ�õ�Ԫ��,����ֵ�ĸ���ǰ��Ԫ�ء�
	         //�����һ��a,�滻ΪA
	         String setE = list.set(4, "A");
	         System.out.println("���滻��Ԫ��:"+setE);//���滻��Ԫ��:a
	         System.out.println(list);//[a, b, itheima, d, A]

	         //List���ϱ�����3�ַ�ʽ
	         //ʹ����ͨ��forѭ��
	         for(int i=0; i<list.size(); i++){
	             //public E get(int index):���ؼ�����ָ��λ�õ�Ԫ�ء�
	             String s = list.get(i);
	             System.out.println(s);
	         }
	         System.out.println("-----------------");
	         //ʹ�õ�����
	         Iterator<String> it = list.iterator();
	         while(it.hasNext()){
	             String s = it.next();
	             System.out.println(s);
	         }
	         System.out.println("-----------------");
	         //ʹ����ǿfor
	         for (String s : list) {
	             System.out.println(s);
	         }

	         String r = list.get(5);//IndexOutOfBoundsException: Index 5 out-of-bounds for length 5
	         System.out.println(r);

	     }
	 }

}
