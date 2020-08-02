package cn.yj.lpp;

import java.util.ArrayList;

public class Demo09ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> arrayA = new ArrayList<>();
        //往ArrayList中添加元素
        arrayA.add("加油");
        arrayA.add("fight");
        arrayA.add("hard");
        arrayA.add("try");
        arrayA.add("once again");
        System.out.println(arrayA);
        arrayA.remove(2);
        arrayA.remove("try");
        System.out.println(arrayA);
        System.out.println(arrayA.size());
         }

}
