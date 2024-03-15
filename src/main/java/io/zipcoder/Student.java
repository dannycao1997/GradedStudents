package io.zipcoder;
import java.util.ArrayList;



//Student class
public class Student {

    // Define Instance Variables
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    // Define Constructor
    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        for(Double score : examScores) {
            this.examScores.add(score);
        }

    }

    public String getFirstName(){
        return firstName;
    }

}
