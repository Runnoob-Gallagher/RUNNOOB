package cn.zj.cq;

public class Demo02Equals {
    public static void main(String[] args) {
        Demo02Equals demA = new Demo02Equals();
        Demo02Equals demB = new Demo02Equals();
        System.out.println(demA);
        System.out.println(demB);
        boolean answer = demA.equals(demB);
        /*public boolean equals(Object obj) {
            return (this == obj); this -----> 谁调用的就是谁  ，这里就是demA咯
        }
*/
        System.out.println(answer);
    }
}
