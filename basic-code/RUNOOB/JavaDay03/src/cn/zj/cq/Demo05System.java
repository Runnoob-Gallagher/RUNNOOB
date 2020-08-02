package cn.zj.cq;

import java.util.Arrays;

public class Demo05System {
    public static void main(String[] args) {
       //Arrays aa = new Arrays();//这里为什么报错呢，看源码，他被private修饰了，就不能创建对象；
        // 某个类的构造被声明为私有的话,就意味着其他的类不能直接调用该类生成新的对象
        int[] arrA = {1,2,3,4,5,6,7,8,9,10};
        int[] arrB = {10,20,30,40,50,60,70,80,90,100};
        System.arraycopy(arrA,1,arrB,4,4);//这个是类方法
        System.out.println(Arrays.toString(arrB));//这里为什么能直接用Arrays类，因为你导包了；而且为什么能直接调用方法，因为他是静态方法
   }

}
