package cn.yj.lpp;

public class Operator05 {
    public static void main(String[] args) {
        /*与 && 全部为true才是true；
          或 || 只要有一个为true就是true；
          反 ！ 和设定的值相反；*/
        System.out.println(false && true);
        System.out.println(3 >= 4 && 5 <= 7);
        System.out.println(true && false);
        System.out.println(5 <= 7 && 2 >=1);
        System.out.println(false || true);
        System.out.println(3 >= 4 || 5 <= 7);
        System.out.println(true || false);
        System.out.println(5 <= 7 || 2 >=1);
        System.out.println(!true);

        //三元运算符。一般用于判断
       // 格式 ： 数据类型 变量名称 = 条件判断 ？ 表达式A : 表达式B;  注意哦，要用参数去接收它，要么直接打印
            int a = 4;
            int b = 5;
            int max = a > b ? a : b ;
        System.out.println(max);
        System.out.println(a < b ? a : b);
    }
}
