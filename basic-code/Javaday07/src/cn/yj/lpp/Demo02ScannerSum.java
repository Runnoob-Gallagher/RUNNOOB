package cn.yj.lpp;
/*/求出两个输入值的和；*/

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        System.out.println("第一个输入数字为："+inputA);
        int inputB = sc.nextInt();
        System.out.println("第二个输入数字为："+inputB);
        int sum = inputA + inputB ;
        System.out.println(sum);
    }
}
