//package javaoop.exercises._2;

public class Student{
    String name;
    int age;

public Student(String name, int age) {
    System.out.println("Constructing!");
    this.name = name;
    this.age = age;
    System.out.println(name + age);
    System.out.println("Constructed!");
    }
    public Student(String name){
    this.name = name;
    }
    public Student(Integer age){
    this.age = age;
    }
    public Student(){

    }

}


