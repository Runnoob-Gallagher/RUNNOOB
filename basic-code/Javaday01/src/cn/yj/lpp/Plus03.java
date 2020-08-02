package cn.yj.lpp;

public class Plus03 {
    public static void main(String[] args) {
        /*java中加号的使用方法有三种
        1.对数值来说就是数值相加
            2.对于字符类型来说，要将其先提升为int类型，然后想加
                3.对于字符串来说，加号代表连接操作*/
        int num1 = 3;
        int num2 = 4;
        int num3 = num1 + num2 ;
        System.out.println(num3);

        char A = 'A';
        int num4 = num3 + A;
        System.out.println(num4);

        String str1 = "刘佩佩";
        String str2 = "杨洁";
        String str3 = str1 + str2;
        String str4 = str3 + 999 ;
        System.out.println(str3);
        System.out.println(str4);

    }
}
