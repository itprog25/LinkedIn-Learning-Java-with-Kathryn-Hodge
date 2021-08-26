package Classes.StudentProfile;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Tom","Sam",2020,7.63,"BCA");
        Student studentB = new Student("Bob","Bob",2019,8.93,"BCom Finance");

        int studAUpdatedGraduationYear = studentA.incrementExpectedGraduationYear();
        System.out.println("Student Details are :");
        System.out.println("Student Name: "+studentA.studFirstName);
        System.out.println("Student Last Name: " +studentA.studLastName);
        System.out.println("Student GPA: "+studentA.studGPA);
        System.out.println("Student Major: "+studentA.studMajor);
        System.out.println("Student Expected Graduation Year: " +studAUpdatedGraduationYear);
    }
}
