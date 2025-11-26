import java.util.Scanner;

public class SiakadWhile1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah mahasiswa");
            int jml = sc.nextInt();
            int i = 0;
            while (i < jml) {

                i++;
            
            while (i < jml) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                int nilai = sc.nextInt();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                    continue;
                
                }
                
                if (nilai > 80 && nilai <= 100) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                } else if (nilai > 73 && nilai <= 80 ) {
                  System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
                } else if (nilai > 65 && nilai <= 73 ) {
                  System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C" );
                } else if (nilai > 60 && nilai <= 65 ) {
                  System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
                }
                
            }

            }
        }



    }
}
