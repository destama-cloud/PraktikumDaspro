import java.util.Scanner;

public class SistemAksesPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda membawa kartu mahasiswa? (ya/tidak): ");
        String punyaKartu = input.nextLine();

        System.out.print("Apakah Anda sudah terdaftar online? (ya/tidak): ");
        String terdaftarOnline = input.nextLine();

        // Jika membawa kartu mahasiswa atau sudah terdaftar online
        if (punyaKartu.equalsIgnoreCase("ya") || terdaftarOnline.equalsIgnoreCase("ya")) {
            System.out.println("Anda diizinkan masuk ke perpustakaan.");
        } else {
            System.out.println("Maaf, Anda tidak diizinkan masuk ke perpustakaan.");
        }

        input.close();
    }
}
