package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*迭代器的作用：对集合进行遍历
常用方法：boolean hasnext();判断是否存在下一个元素
         E next();取出下一个元素
Iterator是一个接口，无法使用，需要使用Iterator的实现类对象--->使用Collection接口的方法iterator()
        Iterator<E> iterator()返回在此 collection 的元素上进行迭代的迭代器。
迭代器的使用：
1.使用集合中的方法iterator()获取迭代器中的实现类对象，使用iterator接口来接收(这里体现了多态)：对象  接口
2.使用iterator接口中的方法hasnext判断还有么有下一个元素
3.使用iterator接口中的next取出集合中的下一个元素*/
public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>(); //多态
        col.add("习近平");
        col.add("胡锦涛");
        col.add("温家宝");
        col.add("王毅");
        col.add("杨洁篪");
        System.out.println(col);
        Iterator<String> it = col.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println("==========");
        for(Iterator<String> itt = col.iterator();itt.hasNext();itt.next()){
            String str = itt.next();
            System.out.println(str);
        }

    }
}
