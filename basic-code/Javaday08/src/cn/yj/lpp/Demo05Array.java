package cn.yj.lpp;
//定义数组用以储存Person类型对象；

public class Demo05Array {
    public static void main(String[] args) {
       // int[] arrayA = new int[3];  //这里我写的是错误的，这里用以存储Person类型的对象，那就要创建Person类型的数组
        Person[] arrayA = new Person[3];
        Person p1 = new Person("yangjie",24);
        Person p2 = new Person("liupepe",25);
        Person p3 = new Person("yanghao",24);
        //将值传递到数组中去；
        arrayA[0] = p1;
        arrayA[1] = p2;
        arrayA[2] = p3;
        for (int i = 0; i <arrayA.length ; i++) {
            System.out.println(arrayA[i]); //这里输出的是地址值欸？为什么呢。哦！本来传递的就是地址值
        }
        System.out.println(arrayA[1].getName()); //这里调用getName方法
    }
}
