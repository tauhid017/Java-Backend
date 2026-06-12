package Basics;

import Basics.Encapsulation.Intro;

public class MainClass {
     static void main() {
//        Person P1 = new Person(21,"Tauhid");
//        Person P2 = new Person(16,"Jeeshan");
//
////         System.out.println(P1.age);
////         System.out.println(P1.name);
////         P1.walk();
////         P1.walk(10000);
////         System.out.println(Person.count);
////         System.out.println(P2.name);
//         Developer d1 = new Developer(22,"Totz");
//         d1.walk();
//         Intro obj = new Intro();
//         obj.dowokr();
    }
}
class Person{
    int age;
    String name;
    static int count;
//    public Person(){
//        count++;
//        System.out.println("creating an object");
//    }
    public Person(int age,String name){
        this.age = age;
        this.name = name;
       // this();
    }

    void walk(){
        System.out.println(name +" is walking");
    }
    void talk(){
        System.out.println(name +" is talking");
    }
    void walk(int steps){
        System.out.println(name +" walked "+steps+" steps");
    }
}
class Developer extends Person{
    public Developer(int age,String name){
        super(age,name);
    }
}