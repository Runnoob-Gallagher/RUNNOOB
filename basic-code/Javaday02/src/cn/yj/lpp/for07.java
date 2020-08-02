package cn.yj.lpp;

// 在这个例子中发现方法体中的变量在方法体外不能使用欸
public class for07 {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        System.out.println("循环结束");

    }

}
