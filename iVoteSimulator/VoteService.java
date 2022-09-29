/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: To determine the total number of each student's response
 */

package iVoteSimulator;

import java.util.ArrayList;

public class VoteService {
    private boolean isMultiChoice;
    private ArrayList<String> studentAns;
    private int A = 0, B = 0, C = 0, D = 0;

    public VoteService(boolean questionType, ArrayList<String> answers) {
        this.isMultiChoice = questionType;
        this.studentAns = answers;
    }

    public void scoreCalculator(ArrayList<String> studentAns) {
        for (int i = 0; i < studentAns.size(); i++) {
            String answer = studentAns.get(i);
            if (answer.equals("A")) {
                A++;
            } else if (answer.equals("B")) {
                B++;
            } else if (answer.equals("C")) {
                C++;
            } else if (answer.equals("D")) {
                D++;
            } else {
                System.out.print("Error: Invalid input");
            }
        }
    }

    public void printAnswer() {
        System.out.println("Chosen Answers:  \nA: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
        // Reset the score for next question
        A = 0;
        B = 0;
        C = 0;
        D = 0;
    }

    public void revote(ArrayList<String> newAns) {
        scoreCalculator(newAns);    // calulates the score 
        printAnswer();              // display answers on interface
    }
}
