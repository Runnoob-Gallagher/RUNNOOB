package cn.zj.cq;
/*装箱的两种方法
1.使用Integer构造器
Integer aa = new interger(11);
2.使用valueOf静态方法
valueOf(11);
拆箱的方法
1.使用静态方法
intValue(aa)*/
public class Demo08Integer {
    public static void main(String[] args) {
        Integer aa = new Integer(11);
        System.out.println(aa);
        System.out.println(aa.toString());

        //System.out.println(Arrays.toString(aa));
        System.out.println(Integer.valueOf(aa));
    }
    //public static Integer
}
