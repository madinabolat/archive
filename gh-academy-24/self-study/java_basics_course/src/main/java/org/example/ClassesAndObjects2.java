package org.example;

public class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.setName("Jane");
        person1.setAge(5);
        person1.introduceSelf();
        System.out.println("My name is "+ person1.getName());

    }
}

class Person2{
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("Entered empty name");
        }
        else{
            name = username;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userage){
        if (userage<0){
            System.out.println("Age can't be negative");
        }
        else{
            age = userage;
        }

    }
    public int getAge(){
        return age;
    }
    int calculateYearstoRetirement(){
        int years=65-age;
        return years;
    }
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    void introduceSelf(){
        System.out.println("My name is "+name+", "+ "I am " + age + " old");
    }
    void sayHello(){
        System.out.println("Hi!");
    }
}

