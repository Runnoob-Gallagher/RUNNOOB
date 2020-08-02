package cn.yj.lpp;
//在这里ArrayList是动态的，可以随时插入新的元素的。如果没有东西就直接打印[]
import java.util.ArrayList;

public class Demo07ArratList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
     //   ArrayList<String> list = new ArrayList<>();  上下两种写法均可

        System.out.println(list);
        list.add("张三");
        list.add("李四");
        list.add("王麻子");
        System.out.println(list);
        list.add("我还可以加");
        System.out.println(list);
    }
}
