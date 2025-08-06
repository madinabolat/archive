package org.example.school.management;

public class CourseManager {
    private Student[] students;

    CourseManager(){
        this.students = new Student[]{};
    }

    public void addStudent(Student student){
        int n = students.length;
        students[n] = student;
    }

    public void displayAllStudents(){
        int i = 0;
        while (i < students.length){
            System.out.println(students[i]);
        }
    }
}
