package cn.yj.lpp;

public class Demo06Reverse {
    public static void main(String[] args) {
        //数组反转
        int temp;
        int[] ArryA = {1, 2, 3, 4, 5, 6};
        //System.out.println(ArryA.length);
        for (int i = 0; i <=ArryA.length-1; i++) {
            System.out.println(ArryA[i]);
        }
        System.out.println("========");
        for (int i = 0, j =ArryA.length-1; i < j;i++ , j--) {
            temp = ArryA[i];
            ArryA[i] = ArryA[j];
            ArryA[j] = temp;
        }
        for (int i = 0; i <=ArryA.length-1 ; i++) {
            System.out.println(ArryA[i]);
        }
    }
}
