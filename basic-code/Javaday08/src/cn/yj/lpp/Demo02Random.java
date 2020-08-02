package cn.yj.lpp;

//打印1~n之间的随机数，因为取值是左闭右开，所以在随机数基础上加1就可以得到全闭的值了

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random ran = new Random();
        for (int i = 0; i <20 ; i++) {
           int num = ran.nextInt(10) + 1;
            System.out.println(num);
        }
    }
}
