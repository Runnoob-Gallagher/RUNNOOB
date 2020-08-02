package cn.yj.lpp;

public class Demo07Reverse02 {
    public static void main(String[] args) {
        int[] ArrayA = {1,2,3,4,5,6,7,8};
        int temp;

           for (int i = 0,j=ArrayA.length-1-i; i <j; i++) {
               j = ArrayA.length-i;
            temp = ArrayA[i];
            ArrayA[i] = ArrayA[ArrayA.length-1-i];
            ArrayA[ArrayA.length-1-i] = temp;
                      }
        for (int i = 0; i <ArrayA.length ; i++) {
            System.out.println(ArrayA[i]);
        }
           }
}
