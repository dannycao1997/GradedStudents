package io.zipcoder;
import java.util.ArrayList;



//Student class
public class Student {

    // Instance Variables
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    // Constructor
    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        for(Double score : examScores) {
            this.examScores.add(score);
        }

    }

    // Getters and Setters

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores(){
        return examScores;
    }

    public int getNumbersOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        if(examNumber)
    }






}
