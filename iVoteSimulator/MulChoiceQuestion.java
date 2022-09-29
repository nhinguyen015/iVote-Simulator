/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: Display multiple choice question for student to choose from
 */

package iVoteSimulator;

import java.util.ArrayList;

public class MulChoiceQuestion implements Question {
    private String mulQ;
    private ArrayList<String> mulAns = new ArrayList<String>();
    private boolean isMultiChoice = true;

    public MulChoiceQuestion(String question, ArrayList<String> answers) {
        this.mulQ = question;
        this.mulAns = answers;
    }

    public void setQuestion(String question) {
        this.mulQ = new String(question);
        
    }

    public String getQuestion() {
        return mulQ;
    }

    public void setAnswer(ArrayList<String> answers) {
        this.mulAns = answers;
    }

    public ArrayList<String> getAnswer() {
        return mulAns;
    }

    public boolean isMultiChoice() {
        return isMultiChoice;
    }
}
