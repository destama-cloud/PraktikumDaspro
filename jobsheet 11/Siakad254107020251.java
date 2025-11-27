import java.util.Scanner;

public class Siakad254107020251{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] score = new int[4][3];
        int sumForEachStudent;
        
        // 6. Use a scanner and a nested loop to fill in the elements
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            sumForEachStudent = 0;
            
            for (int j = 0; j < score[i].length; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }
            
            // 7. Calculate and display the average score for each student
            System.out.println("Average score: " + (double) sumForEachStudent / 3);
            System.out.println(); // Baris kosong untuk pemisah
        }

        System.out.println("--- Average Score Per Course ---");
        
        // 8. Add program code to calculate the average grade for each course
        for (int j = 0; j < 3; j++) { // Kolom (Mata Kuliah)
            double sumForEachCourse = 0;
            
            for (int i = 0; i < 4; i++) { // Baris (Siswa)
                sumForEachCourse += score[i][j];
            }
            
            System.out.println("Course " + (j + 1) + ": " + (sumForEachCourse / 4));
        }

        sc.close();
    }
}