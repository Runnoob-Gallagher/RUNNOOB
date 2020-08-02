package cn.yj.lpp;

public class Demo04Array {
    public static void main(String[] args) {
        int[] arryA = new int[3];
        System.out.println(arryA);
        System.out.println(arryA[0]);
        int[] arryB = new int[3];
        System.out.println(arryB);
        System.out.println(arryB[0]);
        arryA[0] = 1;
        arryB[0] = 1;
        System.out.println(arryA[0]);
        System.out.println(arryB[0]);
        int[] arryC = arryA;
        System.out.println(arryA);
        System.out.println(arryC);
        Boolean b = arryA == arryC ? true : false;
        System.out.println( arryA == arryC ? true : false);
        System.out.println(b = arryA == arryC ? true : false);
       /* System.out.println(Boolean b = arryA == arryC ? true : false);
        System.out.println(Boolean b = false);*/  //前面一句相当于这一句，这样打印肯定是错的；
    }
}
