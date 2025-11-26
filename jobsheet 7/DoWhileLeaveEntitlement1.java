import java.util.Scanner;

public class DoWhileLeaveEntitlement1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 10;
        int numLeave;
        String confirmation;

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don't have enough leave entitlement.");
                    System.out.println("Please enter a number less than or equal to " + leaveEntitlement);
                }
            } else {
                System.out.println("Okay, no leave taken.");
            }

        } while (leaveEntitlement > 0);

        System.out.println("You have used up all your leave entitlement.");
        input.close();
    }
}