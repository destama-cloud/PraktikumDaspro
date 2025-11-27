import java.util.Scanner;

public class CinemaWithScanner<StudentID> {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int menu;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                audience[i][j] = "***";
            }
        }

        do {
            System.out.println("\n--- MINI CINEMA MENU ---");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Select menu (1/2/3): ");
            
            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
                menu = 0;
            }

            switch (menu) {
                case 1:
                    System.out.println("\n--- INPUT AUDIENCE ---");
                    String name;
                    int row, column;
                    boolean inputValid = false;

                    System.out.print("Enter a name: ");
                    name = sc.nextLine();

                    while (!inputValid) {
                        try {
                            System.out.print("Enter row number (1-4): ");
                            row = sc.nextInt();
                            System.out.print("Enter column number (1-2): ");
                            column = sc.nextInt();
                            sc.nextLine(); 
                            
                            if (row < 1 || row > 4 || column < 1 || column > 2) {
                                System.out.println("ERROR: Row or column number is not available. Try again.");
                                continue; 
                            }

                            if (!audience[row - 1][column - 1].equals("***")) {
                                System.out.println("WARNING: Seat R" + row + "C" + column + " is already occupied by " + audience[row - 1][column - 1] + ". Enter rows and columns again.");
                            } else {
                                audience[row - 1][column - 1] = name;
                                System.out.println("SUCCESS: " + name + " assigned to seat R" + row + "C" + column + ".");
                                inputValid = true;
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("ERROR: Invalid input format. Please enter numbers for row and column.");
                            sc.nextLine();
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- AUDIENCE LIST ---");
                    System.out.println("Row \t Col 1 \t Col 2");
                    for (int i = 0; i < audience.length; i++) {
                        System.out.print((i + 1) + "\t ");
                        for (int j = 0; j < audience[i].length; j++) {
                            System.out.print(audience[i][j] + "\t ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye! 👋");
                    break;

                default:
                    if (menu != 0) {
                        System.out.println("Invalid menu choice. Please select 1, 2, or 3.");
                    }
                    break;
            }
        } while (menu != 3);

        sc.close();
    }
}