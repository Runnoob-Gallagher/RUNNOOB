package cn.yj.lpp;

public class Demo08Test {
    public static void main(String[] args) {
        double num1 = -10.9;
        double num2 = 5.8;
        int count = 0;
        for (int i =(int) Math.ceil(num1); i <(int)num2 ; i++) {
            System.out.println(i);
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1)
            count++;
        }
        System.out.println(count);
    }
}
