import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("N must be at least 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        scanner.close();


    }
}