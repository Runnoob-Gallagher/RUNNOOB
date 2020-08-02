package cn.yj.lpp;

/*public static double abs(double num);  获取绝对值
public static double ceil(double num); 向上取整
public static double floor(double num); 向下取整
public static long round(double num); 四舍五入
Math.PI 代表圆周率 double类型*/
public class Demo06Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("===========");
        System.out.println(Math.ceil(2.9));
        System.out.println(Math.ceil(-2.9));
        System.out.println(Math.ceil(2.1));
        System.out.println("===========");
        System.out.println(Math.floor(2.1));
        System.out.println(Math.floor(2.8));
        System.out.println(Math.floor(-2.8));
        System.out.println("============");

        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));
    }
}
