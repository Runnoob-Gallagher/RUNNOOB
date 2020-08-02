package cn.yj.lpp;

public class elseif05 {
    public static void main(String[] args) {
        int a = 330;
        if(a < 200 &&  a > 100){
            System.out.println("一百到两百之间");
        }else if( a >= 200 && a <= 500){
            System.out.println("200到500之间");
        }else if(a > 1000){
            System.out.println("大于1000");
        }else{
            System.out.println("傻笔");
        }
        //数据类型 变量名称 = 条件判断 ？ 表达式A : 表达式B;
        int b = a > 3? 2 : 1;
        System.out.println(b);
        int c = b > a? a-1 : a+1;
        System.out.println(c);
    }
}
