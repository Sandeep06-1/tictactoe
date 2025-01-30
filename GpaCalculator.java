import java.util.Scanner;
public class GpaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        // Arrays to store the grades and credits
        double[] grades = new double[numberOfSubjects];
        double[] credits = new double[numberOfSubjects];
        double totalCredits = 0;
        double weightedGradePoints = 0;
        // Input grades and credits
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextDouble();
            totalCredits += credits[i];
            weightedGradePoints += grades[i] * credits[i];
        }
        // Calculate GPA
        double gpa = weightedGradePoints / totalCredits;
        // Display the GPA
        System.out.println("Your GPA is: " + gpa);
        scanner.close();
    }
}
