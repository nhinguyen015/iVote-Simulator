/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: Store student's ID and their answers to each student
 */

package iVoteSimulator;
 
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private int id;
    // Hashmap storing the ID first and the list of answers as second
    HashMap<Integer, ArrayList<String>> studentAnswer = new HashMap<Integer, ArrayList<String>>();

    // Get ID by student
    public Student(int id) {
        this.id = id;
    }

    // Set ID to the student
    public void setID(int setID) {
        this.id = setID;
    }

    // Fetch ID from student
    public int getID() {
        return id;
    }

    // Set current ID with the current answer for the current student
    public void setStudentAnswer(int curID, ArrayList<String> curAns) {
        studentAnswer.put(curID, curAns);
    }

    public ArrayList<String> getStudentAnswer(int studentID) {
        ArrayList<String> answer = studentAnswer.get(studentID);
        return answer;
    }
 }