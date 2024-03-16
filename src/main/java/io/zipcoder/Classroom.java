package io.zipcoder;
import java.util.*;

// THIS LAB WAS SOO HARD
// REMINDER COME BACK AND REWRITE CODE
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


    //getters for students
    public Student[] getStudents() {
        return students;
    }


    //method to calculate average exam score in classroom
    public double getAverageExamScore() {
        double sum = 0;
        int count = 0;

        for (Student student : students) {
            sum += student.getAverageExamScore();
            count++;
        }
        return sum / count;
    }


    //method to add a student into the classroom
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            students[i] = student;
            break;
        }
    }


    //method to remove a student from the classroom by first and last name
    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                break;
            }
        }
    }


    //method to get students by score
    // need to come back and rewrite
    public Student[] getStudentsByScore(){
    Arrays.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getAverageExamScore).
            reversed().thenComparing(Student::getLastName).reversed().thenComparing(Student::getFirstName)));
            return students;
    }


    //method to get the grade book
    // need to come back and rewrite code , was soo hard
    public Map<Student, Character> getGradeBook(){
        Map<Student, Character> gradeBook = new LinkedHashMap<>();
        Student[] sortedStudents = getStudentsByScore();

        int totalStudents = sortedStudents.length;
        int upper10thPercentile = totalStudents / 10;
        int upper11thTo29thPercentile = totalStudents * 2 / 10;
        int upper30thTo50thPercentile = totalStudents * 5 / 10;
        int lower11thPercentile = totalStudents - upper10thPercentile;

        for (int i = 0; i < sortedStudents.length; i++){

            if (i < upper10thPercentile) {
                gradeBook.put(sortedStudents[i], 'C');

            } else if ( i < upper11thTo29thPercentile) {
                gradeBook.put(sortedStudents[i], 'B');

            } else if ( i < upper30thTo50thPercentile) {
                gradeBook.put(sortedStudents[i], 'A');

            } else if ( i < lower11thPercentile) {
                gradeBook.put(sortedStudents[i], 'D');

            } else {
                gradeBook.put(sortedStudents[i], 'F');
            }
        }
        return gradeBook;
    }
}

