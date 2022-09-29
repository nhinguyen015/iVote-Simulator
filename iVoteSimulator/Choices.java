/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: To display the choices for students to choose from (one or multiple)
 */

package iVoteSimulator;

public class Choices {
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;

    public Choices(String a, String b, String c, String d) {
        this.choiceA = a;
        this.choiceB = b;
        this.choiceC = c;
        this.choiceD = d;
    }

    public void printChoices() {
        System.out.println("A. " + choiceA + "\n" + "B. " + choiceB + "\n" + "C. " + choiceC + "\n" + "D. " + choiceD + "\n");
    }

}
