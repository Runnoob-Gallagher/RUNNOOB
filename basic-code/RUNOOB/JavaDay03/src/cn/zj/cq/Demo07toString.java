package cn.zj.cq;

import java.util.Arrays;

public class Demo07toString {
    public static void main(String[] args) {
        int[] a = {1,23,4,5};
        String str = a.toString();
        System.out.println(str);
        System.out.println(Arrays.toString(a));
       // [I@1b6d3586
         //       [1, 23, 4, 5]
    }
}
