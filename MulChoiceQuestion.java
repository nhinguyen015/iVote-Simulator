/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: Display multiple choice question for student to choose from
 */

import java.util.ArrayList;

public class MulChoiceQuestion implements Display {
    private String mulQ;
    private ArrayList<String> mulAns = new ArrayList<String>();
    private boolean isMultiChoice = true;

    public MulChoiceQuestion(String question, ArrayList<String> answers) {
        this.mulQ = question;
        this.mulAns = answers;
    }

    public String getQuestion() {
        return mulQ;
    }

    public void setQuestion(String question) {
        this.mulQ = new String(question);
        
    }

    public void setAnswer(ArrayList<String> answer) {
        this.mulAns = answer;
    }

    public ArrayList<String> getAnswer() {
        return mulAns;
    }

    public boolean isMultiChoice() {
        return isMultiChoice;
    }
    
    
}
