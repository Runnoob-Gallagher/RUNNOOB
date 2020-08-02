package cn.yj.lpp;

public class Demo01Method {
    public static void main(String[] args) {
        int[] ArrayA = {1,2,3,4,5};
        System.out.println(max(ArrayA));
    }
    public static int max(int[] array){
        int max = array[0];
             for (int i = 0; i <array.length ; i++) {
           if(max < array[i]){
               max = array[i];
           }
                        }
             return max;
       }
}
