import java.util.Scanner;

public class TestingOut {
    public static void main(String[] args) {
        String question = "Which one is a language?";
        String choiceOne = "Windows 10";
        String choiceTwo = "Java 15";
        String choiceThree = "Mac OS X";

        String answer = "Java 15";

        System.out.println(question);
        System.out.println("The choices are :" + " " + choiceOne + " "+ choiceTwo + " "+ choiceThree);

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if(choice.equals(answer.toLowerCase())) {
            System.out.println("Congrats, the answer is correct");
        } else {
            System.out.println("The answer is incorrect. Correct answer is :"+ answer);
        }
    }
}
