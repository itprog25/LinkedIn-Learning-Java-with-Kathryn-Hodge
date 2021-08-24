import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* primitive data types
        1: int
        2: double
        3: boolean
        4: char
        */

        /* reference data types
        1: String

        */

        int studentAge = 22;
        double studentGPA = 7.63;
        String studentFirstName = "John";
        String studentLastName = "Smith";
        // char studentFirstInitial = 'J';
        // char studentLastInitial = 'S';
        boolean hasPerfectAttendance = true;

        /* charAt is a special string operation that allows us to
        to access a character at a specific location within the
        string. */

        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        // Concatenating Strings in Java
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        // Input and Output in Java
        System.out.println("What do you want to update to?");
        
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA );
    }
}
