package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

// THIS LAB WAS SOO HARD
// REMINDER COME BACK AND REWRITE CODE
public class Student { // Student class

    //instance variables
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    //constructor
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }


    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public int getNumbersOfExamsTaken() {
        return examScores.size();
    }


    //method to get all exam scores into a string
    public String getExamScoresString() {
        StringBuilder sb = new StringBuilder("Exam Scores:\n");
        for (int i = 0; i < examScores.size(); i++) {
            sb.append("\tExam ").append(i + 1).append(" -> ").append(examScores.get(i)).append("\n");
        }
        return sb.toString();
    }


    //method to add an Exam Score
    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }


    //method to set an Exam Score
    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber - 1, newScore);
    }


    //method to get Average Exam Score
    public double getAverageExamScore() {
        double sum = 0;
        for (Double score : examScores) {
            sum += score;
        }
        return sum / examScores.size();
    }


    // override toString method
    @Override
    public String toString() {
        return "Student Name:" + firstName + " " + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n" +
                "> " + getExamScoresString();
    }
}