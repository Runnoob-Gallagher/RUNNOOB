package cn.yj.lpp;

import java.util.ArrayList;

/*上一个Demo05中，定义了的数组是不可变的Person[] arrayA = new Person[3]; 这里只能存储三个元素
但是ArrayList集合是可以变化的，这里需要使用到泛型：装在集合中的所有元素都是统一的某个类型，且反省只能是引用类型；*/
public class Demo06Arraylist {
    public static void main(String[] args) {
        Person p = new Person();
        ArrayList<Person> arrayA = new ArrayList<>();
        System.out.println(arrayA);
        Person p1 = new Person("杨坤",45);
        Person p2 = new Person("杨宗伟",48);
        Person p3 = new Person("杨洁",24);
        arrayA.add(p1);
        arrayA.add(p2);
        arrayA.add(p3);
        System.out.println(arrayA);//这里还是像前面一个Demo一样传递的还是地址值；
      // System.out.println(arrayA.getName);  //这里能不能像数组一样，根据地址值获得实际呢？
        for (int i = 0; i <arrayA.size() ; i++) {
            System.out.println(arrayA.get(i));
        }
    }
}
