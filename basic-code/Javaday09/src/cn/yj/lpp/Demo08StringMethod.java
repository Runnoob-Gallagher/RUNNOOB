package cn.yj.lpp;

public class Demo08StringMethod {
    public static void main(String[] args) {
       int[] arrayA = new int[3];
       // arrayA = {1,2,3}; 记住这里的赋值时错的？为什么呢
        arrayA =new int[]{1,2,3}; //这样写会不会太麻烦了呀？？？ 直接写为下面的
     //   int[] arrayB = new int[]{1,2,3};
      //  int[] arrayC = new int[3]{1,2,3};
       // String[] arrayD =
            String strD = FromtoString(arrayA);
        System.out.println(strD);
    }
    public static String FromtoString(int[] arr){
        String strC = "[";
        for (int i = 0; i <arr.length ; i++) {
           if(i == arr.length-1){
                strC =strC + "word" + arr[i] + "]" ;
           }else{
                strC =strC + "word" + arr[i] + "#";
           }
        }
        return strC;
    }
}
