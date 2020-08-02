package cn.zj.cq;

public class Demo04StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(1.1);
        sb.append("asdsadada");
        sb.append('a');
        sb.append(false);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
        int[] arrA = {21,434,54,65,5,543,5345,2342,6457,658,787,967,8675634};
        int[] arrB = {1,2,3,4,5,6,7,8,9,0};
        System.arraycopy(arrA,2,arrB,4,4);
        System.out.println(arrB.toString());
    }

}
