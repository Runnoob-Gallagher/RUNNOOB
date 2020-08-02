package cn.yj.lpp;
//字符串常量池，基本类型比较值，引用类型比较地址值
public class Democ02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] str3 = {'a','b','c'};
        String str4 = new String(str3);
        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println(str2 == str4);
    }
}
