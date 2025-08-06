package org.example;

public class ThisKeyword {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Jane");
        human1.setAge(5);
        human1.display();

        //Human human2 = new Human();
        //Human human2 = new Human("Bob");
        Human human2 = new Human("Bob", 10);
        human2.display();

    }
}
class Human{
    String name;
    int age;

    public Human(){
        System.out.println("Hello from the first constructor");
    }
    public Human(String name){
        this.name = name;
        System.out.println("Hello from the second constructor");
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Hello from the third constructor");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println(name+", "+age);
    }

}
