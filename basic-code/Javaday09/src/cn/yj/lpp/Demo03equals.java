package cn.yj.lpp;
//java中== 比较的是变量(栈)内存中存放的对象的(堆)内存地址，用来判断两个对象的地址是否相同，即是否是指相同一个对象。
// 比较的是真正意义上的指针操作
public class Demo03equals {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = "abc";
        String str3 = "abc";
        String str4 = str3;
        char[] str5 = {'a','b','c'};
        String str6 = new String(str5);
        System.out.println(str1.equals(str2));  //false
        System.out.println(str2.equals(str3));  //true
        System.out.println(str4.equals(str3));  //true
        System.out.println(str5.length);        //3
        System.out.println(str6.equals(str3));  //true
        System.out.println(str6==str3);  //false
    }
}
