# iVote-Simulator
Assignment 1 of CS3560 | Object Oriented Programming course

## Description
This is a Java-based simulation tool based on the live poll idea similar to the software used during the class. This is going to be a pure desktop-based console program, WITHOUT web interactions or graphical UIs required.

## Basic functions
* [x] Configure the question types and candidate answers. 
  * Should support 2 types of questions: multiple-choice question (more than one choice can be chosen including
one choice) and single choice question (only one choice can be chosen)
  * For each type, you can configure the candidate answers, such as “A”, “B”, “C”, “D”, or “1.
Right”, “2. Wrong”, etc.

* [x] Allow students to submit answers. Every student has a unique ID (String), and can
submit an answer to the iVote service.

* [x] The Voting Service can be first configured with a given question type and candidate
answers
  * Then, it can start accepting submissions from students.
  * Eeach student can only submit one answer. If multiple submissions are received from the same student, only the last
submission will be counted.

* [x] The Voting Service can also output the statistics of the submission results (no graphical interface). Simply use the standard output (System.out) to print out the count for each answer. 
  For example, “A : 5, B : 12”, or “1. Right : 15, 2. Wrong : 20”. Feel free to customize the format for your output.

* [x] Need a SimulationDriver to automatically simulate the whole process. Basically, the driver will
  * Create a question type and configure the answers
  * Configure the question for iVote Service
  * Randomly generate a number students and the answers
  * Submit all the students’ answers to iVote Service
  * Call the Voting Service output function to display the result.
  
* [x] Program is written in Java, and follow the important Java OOP principles in the course. The minimum core concepts (classes) you probably need to have are:
  1) Student
  2) Question
  3) VotingService
  4) SimulationDriver
  
* [x] SimulationDriver should contain a main() method that triggers the whole process. 
  * Randomly generate the IDs and answers for a group of students to simulate the submission process and check the results.
