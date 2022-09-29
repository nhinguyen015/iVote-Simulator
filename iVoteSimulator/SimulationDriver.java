/**
 *  Nhi Nguyen
 *  CS 3560 Assignment 1
 *  Purpose: Run the iVoteSimulator to generate random number of students voting on various questions (both multiple and single choice questions)
 */

package iVoteSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatWidthException; 

class SimulationDriver {
    private static MulChoiceQuestion q1;
    private static OneChoiceQuestion q2;
    private static VoteService ques1, ques2;
    private static String curQuestion;
    private static Choices mulChoices, oneChoice;
    private static ArrayList<String> curAnsList = new ArrayList<String>();
    private static ArrayList<String> studentAns = new ArrayList<String>();
    final static int TOTAL_STUDENTS = (int)(Math.random() * 50) + 1;
    private static Student[] student = new Student[TOTAL_STUDENTS];

    public static void main(String[] args) {
        System.out.println("WELCOME TO iVOTE SIMULATOR BY NHI NGUYEN");

        // Create student IDs
        System.out.println("Total students participating: " + student.length);
        student = createStudentID(student.length);

        // Adding divider for aesthetic
        for (int i = 0; i < 80; i++) {
            System.out.print("-");

            if (i == 79) {
                System.out.println();
            }
        }

        // MULTIPLE CHOICE QUESTION
        // Set and print questions and answers
        curQuestion = new String ("Which of these are your favorite CPP clubs?");
        curAnsList.add("A");
        curAnsList.add("B");
        curAnsList.add("C");
        curAnsList.add("D");

        q1 = new MulChoiceQuestion(curQuestion, curAnsList);
        System.out.println("Question: " + q1.getQuestion());
        mulChoices = new Choices("sheCodes", "CSS", "eSports Club", "Game Dev");
        mulChoices.printChoices();

        // Students picking their answers randomly
        int numChosenAns;
        Collections.shuffle(curAnsList);
        for (int i = 0; i < student.length; i++) {
            numChosenAns = (int)(Math.random() * curAnsList.size() + 1);
            for (int j = 0; j < numChosenAns; j++) {
                studentAns.add(curAnsList.get(j));
            }
            student[i].setStudentAnswer(i, studentAns);
        }

        // Score calculator
        ques1 = new VoteService(q1.isMultiChoice(), studentAns);
        ques1.scoreCalculator(studentAns);
        ques1.printAnswer();

        // Revote their new choices
        int numRevote = (int)(Math.random() * student.length + 1);
        Collections.shuffle(curAnsList);
        System.out.println("Time to revote...");
        for (int i = 0; i < numRevote; i++) {
            numChosenAns = (int)(Math.random() * curAnsList.size() + 1);
            for (int j = 0; j < numChosenAns; j++) {
                studentAns.set(i, curAnsList.get(j));
            }
            student[i].setStudentAnswer(i, studentAns);
        }
        ques1.revote(studentAns);

        // Adding divider for aesthetic
        for (int i = 0; i < 80; i++) {
            System.out.print("-");

            if (i == 79) {
                System.out.println();
            }
        }

        // ONE CHOICE QUESTION
        // Set and print question and answers
        curQuestion = "What will be the weather tomorrow at CPP?";
        q2 = new OneChoiceQuestion(curQuestion, curAnsList);
        System.out.println("Question: " + q2.getQuestion());
        oneChoice = new Choices("100", "90", "80", "85");
        oneChoice.printChoices();
        studentAns.clear(); // new question

        // Students choosing their answers
        Collections.shuffle(curAnsList);
        for (int i = 0; i < student.length; i++) {
            int oneAnswer = (int)(Math.random() * curAnsList.size());
            studentAns.add(i, curAnsList.get(oneAnswer));
            student[i].setStudentAnswer(i, studentAns);
        }

        ques2 = new VoteService(q2.isMultiChoice(), studentAns);
        ques2.scoreCalculator(studentAns);
        ques2.printAnswer();

        // Revote
        numChosenAns = (int)(Math.random() * student.length + 1);
        Collections.shuffle(curAnsList);
        System.out.println("Revote time...");
        for (int i = 0; i < numRevote; i++) {
            int oneAns = (int)(Math.random() * curAnsList.size());
            studentAns.set(i, curAnsList.get(oneAns));
            student[i].setStudentAnswer(i, studentAns);
        }
        ques2.revote(studentAns);

        System.out.println("Thanks for participating in the iVote Simulator!");
    }

    public static Student[] createStudentID(int numStudents) {
        // Loop will run until the last student in the total list of students
        for (int i = 0; i < numStudents; i++) {
            student[i] = new Student(i + 1);
        }
        return student;
    }
 }