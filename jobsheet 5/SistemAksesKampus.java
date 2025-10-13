import java.util.Scanner;

public class SistemAksesKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda mahasiswa aktif? (ya/tidak): ");
        String statusMahasiswa = input.nextLine();

        if (statusMahasiswa.equalsIgnoreCase("ya")) {
            System.out.print("Apakah Anda sudah terdaftar di perpustakaan? (ya/tidak): ");
            String statusPerpus = input.nextLine();

            if (statusPerpus.equalsIgnoreCase("ya")) {
                System.out.println("Anda dapat mengakses WIFI kampus dan layanan perpustakaan.");
            } else {
                System.out.println("Anda hanya dapat mengakses WIFI kampus. Silakan daftar ke perpustakaan untuk akses penuh.");
            }
        } else {
            System.out.println("Maaf, hanya mahasiswa aktif yang dapat mengakses sistem kampus.");
        }

        input.close();
    }
}
