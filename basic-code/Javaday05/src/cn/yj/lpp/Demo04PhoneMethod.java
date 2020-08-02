package cn.yj.lpp;

import Demo01Student.Student;

public class Demo04PhoneMethod {
    public static void main(String[] args) {
        Phone pho = new Phone(); //这里你因该会用到 同一个包下的另一个类
        System.out.println();
        Student tae = new Student(); //同上
        System.out.println(pho.color);
        System.out.println(pho.money);
        System.out.println(pho.name);
        pho.color = "green";
        pho.money = 4999;
        pho.name = "iphone";
        System.out.println("===========");
        System.out.println(pho.color);
        System.out.println(pho.money);
        System.out.println(pho.name);
    }

}
