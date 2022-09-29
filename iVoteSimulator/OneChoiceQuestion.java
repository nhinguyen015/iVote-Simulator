/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: Display single choice question for student to choose from
 */

package iVoteSimulator;
 
import java.util.ArrayList;

public class OneChoiceQuestion implements Question {
    private String oneQ;
    private ArrayList<String> oneAns;
    private boolean isMultiChoice = false;

    public OneChoiceQuestion(String question, ArrayList<String> answer) {
        this.oneQ = question;
        this.oneAns = answer;
    }

    public void setQuestion(String question) {
        this.oneQ = question;        
    }

    public String getQuestion() {
        return oneQ;
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
