import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];

            // Menentukan nilai tertinggi dan terendah
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }

        
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        
        System.out.println("\n--- Hasil Pengolahan Nilai ---");
        System.out.print("Nilai Mahasiswa: ");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        System.out.println("\nNilai Rata-rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
    }
}


    
