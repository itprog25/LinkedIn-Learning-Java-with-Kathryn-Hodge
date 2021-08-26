package Classes.StudentProfile;

public class Student {
    String studFirstName;
    String studLastName;
    int studExpectedGradYear;
    double studGPA;
    String studMajor;

    public Student (String studFirstName, String studLastName, int studExpectedGradYear,double studGPA, String studMajor) {
        this.studFirstName = studFirstName;
        this.studLastName = studLastName;
        this.studExpectedGradYear = studExpectedGradYear;
        this.studGPA = studGPA;
        this.studMajor = studMajor;
    }

    public int incrementExpectedGraduationYear () {
        this.studExpectedGradYear =studExpectedGradYear+1;
        return this.studExpectedGradYear;
    }
}
