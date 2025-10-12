import java.util.Scanner;

    public class ifCetakKRSNoPresensi {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Apakah Anda sudah mengisi presensi? (ya/tidak): ");
            String sudahPresensi = input.nextLine();

            if (sudahPresensi.equalsIgnoreCase("tidak")) {
                System.out.println("Anda tidak dapat mencetak KRS karena belum mengisi presensi.");
            } else {
                System.out.println("Anda dapat mencetak KRS.");
            }

            input.close();
        }
	
}
