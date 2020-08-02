package cn.zj.cq;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        Date ddA = new Date();

        System.out.println(ddA.toLocaleString());//这里画横线是因为这个方法已经过期了
        System.out.println(ddA.getTime()); //记录从1970到现在的毫秒值
        Date ddB = new Date(1000L); //从1970加这个毫秒值
        System.out.println(ddB);
    }
}
