package cn.yj.lpp;
//这个例子可以看一下，循环体中的变量有效方位只是在循环体中；当方法中没有void时就要使用返回值，而且必须写上返回值的类型！
public class Demo01Method {
    public static void main(String[] args) {

        method(3);
        sout();    //方法不调用就不执行？
    }
    public static int method(int a){
        int c = 3*a;
       // System.out.println("这个方法的作用是"+ c);
        for (int i = 0; i <a ; i++) {
            int b = 2 * i;
            System.out.println(b);
            //return b;
            //System.out.println("是否结束");
        }
        return c;
    }
    public static void sout(){

        System.out.println("哈啊哈");
    }


}
