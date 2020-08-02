package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;
//Collection是所有单列集合的父接口
//Collection集合使用多态创建对象
//这是Collection的顶层方法，下面的子类都是可以使用的

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collA = new ArrayList<>();
        Collection<String> collB = new ArrayList<String>();  //这里的String也可以不写
        collA.add("杨洁");
        collA.add("你要");
        collA.add("加油");
        collA.add("Fight");
        System.out.println(collA);
        boolean result = collA.remove("你要");
        System.out.println(collA);
        System.out.println(result);
       /* collA.clear();
        System.out.println(collA);
        System.out.println(collA.isEmpty());*/
        Object[] str = collA.toArray();
        System.out.println(collA.toString());
        for (int i = 0; i <str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

}
