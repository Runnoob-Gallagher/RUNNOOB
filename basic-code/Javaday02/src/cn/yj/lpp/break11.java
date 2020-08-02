package cn.yj.lpp;

public class break11 {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < a; i++) {
            System.out.println("结果为：" + i);
            for (int j = 0; j <6 ; j++) {
                              if(j == 1){
                               //   continue;//这里的结果不会包括j等于1，因为当j等于1是就跳过当前循环，去执行下一个条件
                               break; //这里结果一直为0 ，因为当j等于1是就结束当前循环（这里就是结束内层循环，执行下一个外层循环条件）
                }
                System.out.println("j的结果为：" + j);
            }
                   }
    }
}
