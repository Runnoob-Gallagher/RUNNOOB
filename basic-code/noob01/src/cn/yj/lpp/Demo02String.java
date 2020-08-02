package cn.yj.lpp;
//这个是测试为社么char类型输出的是就是本身，但是Byte类型输出的就是地址。是装不下了吗
public class Demo02String {
    public static void main(String[] args) {
        String str = new String();
        System.out.println(str);
        int[] a = new int[1];
        char[] cha = new char[4];
        System.out.println(a);
        //System.out.println(cha);
        //https://blog.csdn.net/weixin_30788239/article/details/97679427
    }
}
