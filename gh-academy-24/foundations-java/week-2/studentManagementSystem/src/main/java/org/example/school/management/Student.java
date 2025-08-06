package org.example.school.management;
import org.example.school.Person;

public class Student extends Person {
    private int studentID;
    private String[] enrolledCourses;
    private double tuition;

    Student(String name, int age, int studentID){
        super(name, age);
        this.studentID=studentID;
    }

    void enrollCourses(String[] courses){
        int numCourses = courses.length;
        for (int i = 0; i<numCourses; i++){
            enrolledCourses[i] = courses[i];
        }
    }

    void enrollCourses(String course){
        int numCourses = enrolledCourses.length;
        enrolledCourses[numCourses] = course;
    }

    public double getTuition(){
        return tuition;
    }

    //tuition can only be updated via a public method that calculates based on number of enrolled courses (500 per course)
    // enrolledCourses - should it be public? or should it be an input?
    public void setTuition(){
        this.tuition = 500 * this.enrolledCourses.length;
    }

}
