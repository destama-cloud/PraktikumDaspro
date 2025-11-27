import java.util.Arrays;
import java.lang.String;

public class Cinema254107020251 {

    public static void main(String[] args) {
        String[][] audience = new String[4][2];
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        System.out.println("--- Soal 4 (Panjang Array) ---");
        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);

        System.out.println("\n--- Soal 5 (Panjang Baris For Loop) ---");
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
        }

        System.out.println("\n--- Soal 6 (Panjang Baris Foreach Loop) ---");
        for (String[] rowaudience : audience) {
            System.out.println("Length of row: " + rowaudience.length);
        }

        System.out.println("\n--- Soal 10 (Audiences in row 3 - For Loop) ---");
        for (int j = 0; j < audience[2].length; j++) {
            System.out.println(audience[2][j]);
        }

        System.out.println("\n--- Soal 11 (Audiences in row 3 - Foreach Loop) ---");
        String[] row = audience[2]; 
        for (String s : row) {
            System.out.println(s);
        }

        System.out.println("\n--- Soal 12 (Displaying all audiences with String.join) ---");
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }
        
        System.out.println("\n--- Displaying myNumbers (Experiment 3) ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    }
}