package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class Classroom {

    //defining instance field/variable
    private Student[] students;


    //defining constructors
    public Classroom(int maxNumbersOfStudents) {
        this.students = new Student[maxNumbersOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() { //nullary constructor with 30 students in array
        this.students = new Student[30];
    }

    //getters for studentssss
    public Student[] getStudents() {
        return students;
    }

    //method to calculate average exam score in classroom
    public double getAverageExamScore() {
        double totalAverage = 0;
        int totalStudents = 0;

        for (Student student : students) {
            totalAverage += student.getAverageExamScore();
            totalStudents++;
        }
        return totalAverage / totalStudents;
    }


    //method to add a student into the classroom
    public void addStudents(Student student) {
        for (int i = 0; i < students.length; i++) {
            students[i] = student;
            break;
        }
    }

    //method to remove a student from the classroom by first and last name
    public void removeStudents(String firstname, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(firstname) &&
                    students[i].getLastName().equals(lastName)) {
                students[i] = null;
                break;
            }
        }  //reordering the array after removing student
        Arrays.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName)));
    }

    // method to get students by score
    public Student[] getStudentsByScore(){
    Arrays.sort(students, Comparator.nullsLast(Comparator.comparing()))}
}

