package cn.yj.lpp;

import java.util.Scanner;

//输入三个数字，求出最大值

//注意这个三元符的思想要学会
//int max = a > b ? a : b ;
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为："+ max);
    }
}
