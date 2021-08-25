import java.util.Scanner;

public class Employee {
    public static int calculateSalary() {
        System.out.println("Enter employee name");
        Scanner input = new Scanner(System.in);
        String employeeName = input.nextLine();
        System.out.println("Enter the number of hours employee works per week.");
        int hourWeek = input.nextInt();
        System.out.println("Enter the amount and employee makes per an hour");
        int amountPerHour = input.nextInt();
        System.out.println("Enter number of days employee takes vacation");
        int vacationDays = input.nextInt();
        input.close();
        System.out.println("Total yearly gross Salary of Employee "+employeeName);
        int totalVacationDaysSalary = amountPerHour * vacationDays * 8;
        int totalSalary = hourWeek * amountPerHour * 52 - totalVacationDaysSalary;
        return totalSalary;
    }
    public static void main(String[] args) {
        int grossSalary = calculateSalary();
        System.out.println("is "+ grossSalary);
    }
}
