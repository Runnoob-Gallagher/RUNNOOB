package cn.yj.lpp;
//有无返回值
public class Demo04Return {
    public static void main(String[] args) {
        //System.out.println(cheng(1,2));  因为这里没有返回值，这里相当于没有打印内容，就会报错；
       // int h = cheng(2,3);      //报错：Error:(6, 22) java: 不兼容的类型: void无法转换为int
        int i= sum(4,5);     //不同于上面
        System.out.println(i);
        System.out.println(sum(3,4));
    }
    //没有返回值，就不会把执行结果告诉给任何人，只是 自己打印输出
    public static void cheng(int a,int b){
        int c = a * b;
        System.out.println(c);
    }
    //有返回值，谁调用我，我就把返回值给谁；
    public static int sum(int d,int f){
        int g = d + f;
        return g;
    }

}
