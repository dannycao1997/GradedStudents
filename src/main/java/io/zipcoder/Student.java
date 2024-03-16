package io.zipcoder;
import java.util.ArrayList;


public class Student { // Student class
    //instance variables
    String firstName;
    String lastName;
    ArrayList<Double> examScores;




    //constructor
    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(ArrayList.asList(examScores));
    }



    //getters and setters
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
        if(examNumber
    }

    public void getAverageExamScore(){
        ArrayList<Double> sum = examScores;
    }
    public String toString(){
        return "Studen"
    }







}
