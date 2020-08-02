package cn.zj.cq;

public class Demo03System {
    public static void main(String[] args) {
        int count  = 0;
        String str = "aa";
        Long i = System.currentTimeMillis();
        for (int j = 0; j <9999999 ; j++) {
            count++;
        }
        System.out.println(count);
        Long m = System.currentTimeMillis();
        System.out.println(m-i);
    }
}
