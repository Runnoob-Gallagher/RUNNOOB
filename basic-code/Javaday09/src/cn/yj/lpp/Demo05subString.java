package cn.yj.lpp;

public class Demo05subString {
    public static void main(String[] args) {
        String strA = "asdafsdgdfhfgjfhgsfsdfe";
        String strB = strA.substring(4);
        System.out.println(strB);
        String strC = strA.substring(3,8);//注意这里是左闭右开[3,8}
        System.out.println(strC);
    }
}
