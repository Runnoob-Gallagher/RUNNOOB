package cn.yj.lpp;

import java.util.Arrays;

//对数组进行升序排列，并倒叙打印。要排列的话就要转换为单个的字符类型
public class Demo05Arrays {
    public static void main(String[] args) {
        String str = "sdasdafsdgdfgfvregsdcdsrvsdtcsdt";
        char[] cha = str.toCharArray();
        System.out.println(cha);
        Arrays.sort(cha);
        System.out.println(cha);
        for (int i = cha.length-1 ; i >= 0 ; i--) {
            System.out.print(cha[i]);
        }
    }

    }
