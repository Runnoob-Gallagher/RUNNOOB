package cn.yj.lpp;

import java.util.Arrays;

public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5,6,7,8};
        int[] arrayB = new int[3];
        int[] arrayC = new int[]{1,2,3,4,5};
        System.out.println(arrayB);
        System.out.println(arrayA);
        System.out.println(arrayC);
        System.out.println(arrayA.length);
        System.out.print('[');
        for (int i = 0; i <arrayA.length ; i++) {

            if(i == arrayA.length-1){
                System.out.println(arrayA[arrayA.length-1] + "]");
            }else{
                System.out.print(arrayA[i] + ", " ); //这里是字符格式，要转换为数字，然后进行加减；
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(arrayA));

    }
}
