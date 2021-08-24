import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {

        // Creative, one question, three answer choices (one is correct)
        String question = "What is the Capital of India?";
        String choiceOne = "Kerala";
        String choiceTwo = "New Delhi";
        String choiceThree = "TamilNadu";

        String correctAnswer = choiceTwo;

        // Ask the user a question
        System.out.println(question);

        //Output answer choices to user 
        System.out.println("Choose one of the following:" + " " + choiceOne + " " + choiceTwo + " " + choiceThree);

        //Collect user's input (that is, the answer they provide)
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        // print out an appropriate message to the user (depending on 
        // if they were correct or incorrect)
        if(correctAnswer.equals(userInput)) {
            System.out.println("Congrats, Your answer is correct");
        } else {
            System.out.println("The answer is incorrect, Answer is "+ correctAnswer);
        }
    }
}
