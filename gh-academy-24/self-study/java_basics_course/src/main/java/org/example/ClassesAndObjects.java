package org.example;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Jane";
        person1.age = 10;
        Person person2 = new Person();
        person2.name = "Oliver";
        person2.age = 15;
        //System.out.println("My name is "+person1.name+", "+ "I am " + person1.age + " old");
        //System.out.println("My name is "+person2.name+", "+ "I am " + person2.age + " old");
        person1.sayHello();
        person1.introduceSelf();
        person2.introduceSelf();
        //person1.calculateYearstoRetirement(); <- meaningless, wont do anything
        int year1 = person1.calculateYearstoRetirement();
        System.out.println(year1);

        Person person3 = new Person();
        person3.setNameAndAge("George", 5);
        person3.introduceSelf();
    }
}

class Person{ //convention: class names from Upper case
    String name;
    int age;
    int calculateYearstoRetirement(){
        int years=65-age; //local variable years. created each time method is called. but then vanishes. not stored, saved.  
        //System.out.println("To retirement: "+years+" years");
        return years;
    }
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    void introduceSelf(){ //convention: methods from lower case, camel case
        System.out.println("My name is "+name+", "+ "I am " + age + " old");
    }
    void sayHello(){
        System.out.println("Hi!");
    }
}

//to figure out: if we put this class inside the public class, what changes
//currently class Person is private by default, so can only be accessed in this package? or in this class?
//only one public class per file?
//public class should match the name of the file
