package cn.yj.lpp;

public class Operator04 {
    public static void main(String[] args) {
        int a = 200;
        a += 3; // 相当于a = a + 3;
        System.out.println(a); //203
        a -= 4; // 相当于a = a - 4;
        System.out.println(a);  //199
        a /= 5; // 相当于a = a / 5;
        System.out.println(a); //39
        a *= 6; // 相当于a = a * 6;
        System.out.println(a); //234
        a %= 7; // 相当于啊= a % 7;
        System.out.println(a); //3
    }
}
