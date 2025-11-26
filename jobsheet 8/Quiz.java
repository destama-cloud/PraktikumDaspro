
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';

        do {
            int number = rand.nextInt(10) + 1;  // Random number between 1 and 10
            boolean success = false;

            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine(); // Consume newline

                System.out.println("You entered: " + answer);

                if (answer < number) {
                    System.out.println("Your guess is too low.");
                } else if (answer > number) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Correct! You guessed the number.");
                    success = true;
                }

            } while (!success);

            System.out.println("Do you want to repeat the game (Y/N): ");
            menu = input.next().charAt(0);
            input.nextLine(); // Consume newline
        } while (menu == 'Y' || menu == 'y');

        input.close();
    }
}

/*  
1.Explain the program flow in Experiment 4!
To create a loop based guessing game where the user tries to guess a randomly generated number between 1 and 10, and can choose to repeat the game with scanner random
2.What must be done to discontinue (not repeat) the game?
must respond with any character other than 'Y'  or 'y' when prompted
3. Modify the program above, so that it can display information about: input the guess 
value entered by the user, whether it is smaller or greater than the answer (number) 
randomly determined by the computer!
Done
4.Commit and push the changes to GitHub 
Done






*/

    
