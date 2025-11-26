import java.util.Scanner;

public class ForMultiples1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the multiple: ");
        int multiple = sc.nextInt();
        int sum = 0;
        int counter = 0;

        
        for (int i=1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }

        
        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);

        sc.close();
    }
}