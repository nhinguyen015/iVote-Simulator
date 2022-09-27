/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: Display single choice question for student to choose from
 */

import java.util.ArrayList;

public class OneChoiceQuestion implements Display {
    private String oneQ;
    private ArrayList<String> oneAns;
    private boolean isMultiChoice = false;

    public OneChoiceQuestion(String question, ArrayList<String> answer) {
        this.oneQ = question;
        this.oneAns = answer;
    }

    public String getQuestion() {
        return oneQ;
    }
    
    public void setQuestion(String question) {
        this.oneQ = new String(question);        
    }

    public void setAnswer(ArrayList<String> answer) {
        this.oneAns = answer;
        
    }

    public ArrayList<String> getAnswer() {
        return oneAns;
    }

    public boolean isMultiChoice() {
        return isMultiChoice;
    }
    
}
