package cn.yj.lpp;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Random(num));

    }
    public static int Random(int num){
        Random ran = new Random();
        int ranum = ran.nextInt(num);
        return ranum;
    }
}
