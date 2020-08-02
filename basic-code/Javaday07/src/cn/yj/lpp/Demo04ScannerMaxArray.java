package cn.yj.lpp;

import java.util.Scanner;

public class Demo04ScannerMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] ArrayA = new int[]{a, b, c};
        System.out.println("将输入的数字到字符串中：" + ArrayA);
        //System.out.println(max); 这里要接受return返回的值,就要先定义一个值去接受
        int maxvalue = max(ArrayA);
        System.out.println(maxvalue);
    }
        public  static int max(int[] ArrayA){
            int max = ArrayA[0];
        for (int i = 0; i <ArrayA.length ; i++) {

            if (max < ArrayA[i]) {
                max = ArrayA[i];
            }
        }
        return max;
        }


}
