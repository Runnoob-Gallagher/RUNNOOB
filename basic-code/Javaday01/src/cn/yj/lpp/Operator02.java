package cn.yj.lpp;

public class Operator02 {
    public static void main(String[] args) {
        //求余（取模）运算 %
        int a = 19;
        int num1 = a % 2;
        System.out.println(num1); //结果为1
        //除法运算
        int num2 = a / 2;
        System.out.println(num2);//结果为9

        double num3 = 5;

        double num4 = num2 + num3; //一个运算中有几种不同的数据类型时，结果以较大的为准；
        System.out.println(num4);
    }

}
