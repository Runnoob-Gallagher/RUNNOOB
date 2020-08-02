package cn.yj.lpp;

public class Demo05Boolea {
    public static void main(String[] args) {
        System.out.println(isSame(3,4));
        boolean aa = isSame(3,2);
        boolean bb = issame2(4,5);
        System.out.println(aa);
        System.out.println(bb);
    }
  //  public boolean isSame(int a,int b){     //当不是静态方法时：Error:(5, 9) java: 无法从静态上下文中引用非静态 方法 isSame(int,int)
  public static boolean isSame(int a,int b){
        boolean same;
      if(a == b){
          same = true;
            System.out.println(same);
        }else{
          same = false;
            //System.out.println(same);
        }
      return same;
    }
    public static boolean issame2(int c,int d){
        boolean answer = c == d? true:false;
        return answer;
    }
}
