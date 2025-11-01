import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double avg = (double) total / n;
        char grade;

        if(avg >= 90)
            grade = 'A';
        else if(avg >= 75)
            grade = 'B';
        else if(avg >= 60)
            grade = 'C';
        else if(avg >= 45)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n--- RESULT ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + avg + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
