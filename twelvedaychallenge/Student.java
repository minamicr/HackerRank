package twelvedaychallenge;

import java.util.*;

class Student extends Person{
    private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores){
        super (firstName, lastName, identification);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here

    public char calculate(){
        int total = 0;
        int media = 0;
        int qtt = this.testScores.length;

        for (int i = 0; i < qtt; i++) {
            total += this.testScores[i];
        }

        media = total / qtt;

        if ((90 <= media) && (media <= 100)){
            return 'O';
        } else if ((80 <= media) && (media < 90)) {
            return 'E';
        } else if ((70 <= media) && (media < 80)) {
            return 'A';
        } else if ((55 <= media) && (media < 70)) {
            return 'P';
        } else if ((40 <= media) && (media < 55)) {
            return 'D';
        } else {
            return 'T';
        }

    }

}