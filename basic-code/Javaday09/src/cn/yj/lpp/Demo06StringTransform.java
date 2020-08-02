package cn.yj.lpp;

public class Demo06StringTransform {
    public static void main(String[] args) {
        String strA = new String("dasdasdasdasdasdadasdad");
        String strE = new String("1234");
        System.out.println(strA);
        //将字符串型转换为字符型
        char[] charA = strA.toCharArray();
        System.out.println(charA);
        System.out.println(charA[2]);
        //将字符型转换为Byte型
        byte[] byteA = strA.getBytes();
        System.out.println(byteA);   //这里有点奇怪欸  这里是一个地址值
        System.out.println(byteA[2]);
        for (int i = 0; i <byteA.length ; i++) {
            System.out.print(byteA[i]);
        }
        System.out.println("==========");
        String strD = strA.replace("d","g");
        System.out.println(strD);
    }
}
