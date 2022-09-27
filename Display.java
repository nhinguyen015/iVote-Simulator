/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: The interface to display questions and answer from the students
 */

import java.util.ArrayList;

public interface Display {
    public String getQuestion(); 
    public void setQuestion(String question);
    public void setAnswer(ArrayList<String> answer);
    public ArrayList<String> getAnswer();
    public boolean isMultiChoice();
}
