import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            int N = sc.nextInt();

            
            for (int i = 1; i <= N; i++) {
                
                for (int j = 0; j <= N; j++) {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
    }
}

/*
1.Pay attention to outer loop. If in for syntax, the initialization iOuter = 1 is changed to 
iOuter = 0, what is the result? How can it be like that? 
the result is plus new line and total result is 6
2.Return the program to normal with initialization iOuter = 1. Then pay attention to the 
inner loop. If in for syntax, the initialization i = 1 is changed to i = 0, what is the result? 
How can it be like that?
the result is: 
******
******
******
******
******
3. What is the difference between outer loop and inner loop? 
Outer loop (i) runs 3 times
Inner loop (j) runs 3 columns per row 
4. Why is it necessary to add the syntax System.out.println(); under inner loop? What 
will happen if the syntax is omitted?
System.out.println(); is used to print output to the console and move the cursor to the next line
if omitted The output may appear in a single line or not formatted correctly
5. Commit and push the changes to GitHub
Done
*/