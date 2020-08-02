package cn.zj.cq;

import java.util.Date;

//Date的使用
public class Demo02Date {
    public static void main(String[] args) {
        Date dd = new Date();
        System.out.println(dd);
        System.out.println(dd.getTime()); //计算当前时间与格林威治时间相差的毫秒值
        dd = new Date(23123123132131231L);
        System.out.println(dd);
    }

}


