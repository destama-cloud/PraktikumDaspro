import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); 

        
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Harga: ");
            hargaPesanan[i] = input.nextInt();
            input.nextLine(); 
        }

        
        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        
        System.out.println("\n--- Daftar Pesanan ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("----------------------");
        System.out.println("Total Biaya: Rp" + totalBiaya);
    }


}