package cn.yj.lpp;

import java.util.Random;
/*Random类用来生成随机数字
使用步骤：1.导包      2.创建    3.使用
比如获取一个随机的int数字：
这样获取的数字就是int范围的，有正有负
其中 int num =  r.nextint(3) 代表[0,3),也就是0~2*/
public class Demo01Random {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt();
        System.out.println(num);
        int num1 = ran.nextInt(2) + 1;
        System.out.println(num1);
    }
}
