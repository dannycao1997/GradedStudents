package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;


public class Student { // Student class
    //instance variables
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    //constructor
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(examScores));
    }


    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumbersOfExamsTaken() {
        return examScores.size();
    }


    public ArrayList<Double> getExamScores() {
        return examScores;
    }



    // Method to add an Exam Score
    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }
    // Method to set an Exam Score
    public void setExamScores(int examNumber, double newScore) {
        examScores.set(examNumber - 1, newScore);
    }
    // Method to get Average Exam Score
    public double getAverageExamScore() {
        double sum = 0;
        for (Double score : examScores) {
            sum += score;
        }
        return sum / examScores.size();
    }

    // Method to convert and return to a String
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append("> Average Score: ").append(getAverageExamScore()).append("\n");
        sb.append("> Exam Scores: \n");
        for(int i = 0; i < examScores.size(); i ++) {
            sb.append("\tExam ").append(i + 1).append(" ->").append(examScores.get(i)).append("\n");
        }
        return sb.toString();
    }
}
