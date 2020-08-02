package cn.yj.lpp;

public class Demo01Array {
    public static void main(String[] args) {
/*        数组的特点：
        1.数组是一种引用类型；
        2.数组中的多个数据，数据类型必须一致；
        3.数组的长度指定之后就不能变化；？这个还不是很懂*/
           /* 数组的两组初始化方式：
        1.动态初始化：只指定数组的长度；
        2.静态初始化：给数组赋初值；*/
        int[] arr;
        arr = new int[5];
        int[] arry = {1,2,3,45,6};
        int[] arryb = new int[]{1,23,4,5,6,7};
        //String arryc = new String[]{"hello","World"}; //Error:(16, 24) java: 不兼容的类型: java.lang.String[]无法转换为java.lang.String
        String[] arryf = new String[]{"好好看报错","及你写的数组类型应该为String[]而不是String，这样转换就会报错"};
            String[] arryd = {"hello","world"};
        for (int i = 0; i <arryf.length ; i++) {
            System.out.println(arryf[i]);
        }
    }
}
