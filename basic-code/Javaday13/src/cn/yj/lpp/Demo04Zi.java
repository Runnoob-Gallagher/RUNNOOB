package cn.yj.lpp;

public class Demo04Zi extends Demo04Fu implements Demo04InterFace {
  /*  @Override
    public void methodsame() {
        System.out.println("重写父类中的方法");
    }*/

 /*   @Override
    public void methodsame() {
        System.out.println("重写接口中的方法");
    }

*/
 public static void main(String[] args) {
     Demo04Zi z = new Demo04Zi();
     z.methodsame();
 }
}