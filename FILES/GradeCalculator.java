public import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks obtained in Subject 1 (out of 100): ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks obtained in Subject 2 (out of 100): ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks obtained in Subject 3 (out of 100): ");
        int subject3 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3;

        double averagePercentage = (double) totalMarks / 3;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
} {
    
}
