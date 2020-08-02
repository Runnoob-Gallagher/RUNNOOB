package cn.yj.lpp;

public class StaticTest {
    public static void method(){
        System.out.println("我这个是静态方法");
        // System.out.println(name); 这里报错：非静态域name不能被静态上下文引用
    }
    public String name = "Galagher";
    public static int age = 2;

    public static void main(String[] args) {
        StaticTest sta = new StaticTest();
        int age = 10;
        sta.method();
        System.out.println(sta.age);
        System.out.println(age);
        StaticTest.method();
        System.out.println(sta.name);
       // System.out.println(StaticTest.name); 这里报错：非静态域name不能被静态上下文引用
    }
}
