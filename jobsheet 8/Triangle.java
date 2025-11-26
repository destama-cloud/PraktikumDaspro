import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        sc.close();
    }
}

/*
1.Look at the results, does the output produced with a value of N = 5 match the following 
display?  
output : Each row  contains exactly  asterisks, from 1 to 5
2.If not, which parts should be improved or added? Describe any parts that need to be 
improved or added!
Since the output does match the expected left aligned triangle when n = 5, the program is functionally correct
*/