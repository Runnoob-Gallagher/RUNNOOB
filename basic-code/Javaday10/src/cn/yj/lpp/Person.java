package cn.yj.lpp;

public class Person {
    static {
        System.out.println("这是静态代码块");
    }
    public static void method(){
        System.out.println("这是静态方法");
    }
    public Person(){
        System.out.println("这是构造方法");
    }

    public static void main(String[] args) {
        System.out.println("不知道这个执行不");
    }
}
