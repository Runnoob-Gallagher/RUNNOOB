package cn.zj.cq;

import java.util.Calendar;
import java.util.Date;

//Calendar 类是一个抽象类,Calendar 提供了一个类方法 getInstance，以获得此类型的一个通用的对象;
public class Demo02Calendar {
    public static void main(String[] args) {
        Calendar calA = Calendar.getInstance();  //上面说到获得类的一个对象，那么这个就是一个多态，父类引用指向子类对象；
        Date ddA = calA.getTime();
        System.out.println(ddA);
    }
}
