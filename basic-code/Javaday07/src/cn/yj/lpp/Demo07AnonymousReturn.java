package cn.yj.lpp;

import java.util.Scanner;

//使用匿名对象进行参数的传递和返回
public class Demo07AnonymousReturn {
    public static void main(String[] args) {
        /*//之前的普通方法
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        //现在使用匿名方法
       int num2 = new Scanner(System.in).nextInt();
        System.out.println(num2);*/
        //之前的方法中的参数传递
        Scanner sc = new Scanner(System.in);
        methodreturn(sc);
        Scanner sc1 = new Scanner(System.in);
        methodreturn2(sc1);
        //匿名对象
        methodreturn3(new Scanner(System.in));
    }
   /* public static Scanner method(){  //这个要注意一下了，返回值类型是Scanner，所有的的引用变量都可以作为返回值


    }*/
    //参数的传递
    public static void methodreturn(Scanner sc){
        System.out.println(sc);
    }              //像这样直接输出sc是有问题，因为全文中没有对sc进行定义，他等待着你的输入，具体看下面的
    public static void methodreturn2(Scanner sc1){
       int num1 = sc1.nextInt();
        System.out.println(num1);
    }
    //使用匿名对象来传参数
    public static void methodreturn3(Scanner sc3){
        int num3 = sc3.nextInt();
        System.out.println(num3);
    }
    //使用匿名对象作为参数的返回值
    public static Scanner methodreturn4(){
        /*Scanner sc4 = new Scanner(System.in);
        return sc4;*/   //这是普通的方法返回
        return new Scanner(System.in); //匿名
    }
}
