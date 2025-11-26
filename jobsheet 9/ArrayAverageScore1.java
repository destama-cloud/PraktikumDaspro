
import java.util.Scanner;

public class ArrayAverageScore1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of students: ");
            int numStudents = sc.nextInt();

            int[] scores = new int[numStudents];
            int passCount = 0, failCount = 0;
            double passTotal = 0, failTotal = 0;

            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter the final score " + i + ": ");
                scores[i] = sc.nextInt();

                if (scores[i] > 70) {
                    passTotal += scores[i];
                    passCount++;
                } else {
                    failTotal += scores[i];
                    failCount++;
                }
            }

            if (passCount > 0) {
                System.out.println("The average score of students who passed is " + (passTotal / passCount));
            } else {
                System.out.println("No students passed.");
            }

            if (failCount > 0) {
                System.out.println("The average score of students who failed is " + (failTotal / failCount));
            } else {
                System.out.println("No students failed.");
            }
        }
    }
}
 
    /* 
 
1. Modify the program in Experiment 3 so that the program can display the number of 
students who passed, students who have a score greater than 70 (>70) 
Done
2. Modify the program in Experiment 3 so that it can produce output like the following 
display 
Done
3. Commit and push the changes to GitHub 
Done

    







*/