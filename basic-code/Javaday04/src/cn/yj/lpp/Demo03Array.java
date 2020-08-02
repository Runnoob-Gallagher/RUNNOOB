package cn.yj.lpp;

public class Demo03Array {
    public static void main(String[] args) {
        //动态格式数组可以分为两步
        int[] arryA = new int[5];
        int[] arryB;
        arryB = new int[5];
        //静态格式数组可以分为两步
        int[] arryC = new int[]{1,2,3,4,5};
        int[] arryD;
        arryD = new int[]{1,2,3,4,5};
        //静态初始化省略格式不能分为两步
        int[] arryE = {1,2,3,4,5};
        int[] arryF;
       // arryF = {1,2,3,4,5};
    }
}
