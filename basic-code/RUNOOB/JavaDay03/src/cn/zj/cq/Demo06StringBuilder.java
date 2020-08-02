package cn.zj.cq;

//String和StringBuilder的互换
public class Demo06StringBuilder {
    public static void main(String[] args) {
       String strA = "String";
       StringBuilder sb = new StringBuilder(strA);
        System.out.println(sb);
        sb.append(121212);
        System.out.println(sb);
        StringBuilder ss = new StringBuilder("StringBuilder");
        //StringBuilder转化为String 方法一
        String strB = ss + "";
        System.out.println(strB);
        ////StringBuilder转化为String 方法二
        System.out.println(strB.toString());
    }
}
