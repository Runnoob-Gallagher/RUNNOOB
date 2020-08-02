package cn.yj.lpp;

/*java.lang.String 代表字符串。
  API：      String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。

        字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享
字符串特点：
1.字符串内容永不可变
2.因为 String 对象是不可变的，所以可以共享
3.字符串效果等同于char[]字符数组，但是底层原理是byte[]字节数组
构建字符串的三种方式
1.public String();  创建一个空白字符串，不含有任何内容。
2.public String(char[] array); 根据字符数组的内容，来创建对应的字符串。
3.public String(byte[] array); 根据字节数组的内容，来创建对应的字符串。
直接创建
String str = "hello";*/
public class Demo01String {
    public static void main(String[] args) {
        String str = new String(); //这里是空的字符串
        System.out.println(str);
        char[] arrayA = {'2','3','A','n'};  //字符数组
        String arrayC = new String(arrayA); //根据字符数组来创建字符串的话，那你肯定要先创建一个String类型的字符串，然后
                                            //用这个字符串去接收她；
        System.out.println(arrayC);
        byte[] arrayB = {1,3,44,55,127,97,98,99};//同上
        String arrayD = new String(arrayB);
        System.out.println(arrayD);  //这里输出乱的字符，因为他会去找ASCII码。比如后面的97 98 99代表abc
        String arrayE = "hello";
        System.out.println(arrayE);
    }
}
