package cn.yj.lpp;

public class Demo02Array {


        public static void main(String[] args) {
            // 直接创建一个数组，里面装的全都是int数字，具体为：5、15、25
            int[] arrayA = new int[] { 5, 15, 25, 40 };
            System.out.println(arrayA.length);
            // 创建一个数组，用来装字符串："Hello"、"World"、"Java"
            String[] arrayB = new String[] { "Hello", "World", "Java" };
            for (int i = 0; i <arrayB.length ; i++) {
                System.out.println(arrayB[i]);
            }
        }

    }


