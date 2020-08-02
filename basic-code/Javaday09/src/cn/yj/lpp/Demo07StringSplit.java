package cn.yj.lpp;

public class Demo07StringSplit {
    public static void main(String[] args) {
        String strA = new String();
        strA = "boo:and:foo";
        String[] strB = strA.split("o",5);
        for (int i = 0; i <strB.length; i++) {
            System.out.print(strB[i]);
        }
    }
}
