import java.util.Scanner;

public class SolutionChallenge {
    public static void main(String[] args) {
        String question = "What is the colour of Plants?";
        String choiceOne = "Green";
        String choiceTwo = "Yellow";
        String choiceThree = "Red";

        String answer = choiceOne;

        System.out.println(question);
        System.out.println("choices are :"+ " " + choiceOne + " " + choiceTwo + " " + choiceThree );
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        if(answer.equals(input)) {
            System.out.println("Answer is correct");
        } else {
            System.out.println("Answer is incorrect");
        }
    }
}
