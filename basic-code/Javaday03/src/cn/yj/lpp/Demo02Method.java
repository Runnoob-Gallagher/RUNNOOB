package cn.yj.lpp;

public class Demo02Method {
    public static void main(String[] args) {
        sum(5,4);
        //append();
        System.out.println(append("hello",5));
    }
    public static int sum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public static  String append(String str,int a ){
        /*String c = "Hello";
        int d = 999;*/
        String ansewe = str + a;
       //ystem.out.println(ansewe);
        return ansewe;
    }
}



