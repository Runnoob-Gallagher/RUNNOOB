package cn.yj.lpp;

public class Operator03 {
    public static void main(String[] args) {
        // 注意看这个过程：a的值是不断变化的，比如做完a++之后a的值是会发生变化的，在后面的代码中也会产生影响；
        // a++:先用后加，得到的值是加之前的值。    ++a：先加后用，得到的值是加之后的值
        int a = 3;
        System.out.println(a++);  //3
        System.out.println(++a);  //4
        int num1 = 4;
        int num2 = ++a + num1;
        int num3 = a++ + num1++;
        int num4 = a++ + ++num1;
        System.out.println(num2);  //8
        System.out.println(num3);  //7
        System.out.println(num4);  //8
    }
}
