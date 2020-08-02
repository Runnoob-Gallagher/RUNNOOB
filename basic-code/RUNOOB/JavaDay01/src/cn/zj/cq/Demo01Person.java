package cn.zj.cq;

public class Demo01Person {
    private String name;
    private int age;

    public Demo01Person(){

    }
    public Demo01Person(String name , int age){
            this.name = name;
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  /*  @Override
    public String toString() {
        return "Demo01Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
 /* public String toString(){
      String people = " name =  " + name + "  " + "age = " + age;
      return people;
  }*/
}
