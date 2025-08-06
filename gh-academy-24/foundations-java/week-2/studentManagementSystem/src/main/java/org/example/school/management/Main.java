package org.example.school.management;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Madina", 29, 1);
        Student student2 = new Student("Edward", 2, 2);
        Student student3 = new Student("Tim Ferriss", 6, 3);

        student1.enrollCourses("Math");
        student2.enrollCourses(new String[] {"Dog training", "Gymnastics"});
        student3.enrollCourses(new String[] {"Tango", "Piano", "French"});
        student1.enrollCourses("CS");
        student1.displayDetails();

    }
}