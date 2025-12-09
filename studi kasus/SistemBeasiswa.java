import java.util.ArrayList;
import java.util.Scanner;

class Pendaftar {
    private String nama;
    private String nim;
    private double ipk;
    private String jenisBeasiswa;
    private int penghasilanOrtu;

    public Pendaftar(String nama, String nim, double ipk, String jenisBeasiswa, int penghasilanOrtu) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.jenisBeasiswa = jenisBeasiswa;
        this.penghasilanOrtu = penghasilanOrtu;
    }

    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public double getIpk() { return ipk; }
    public String getJenisBeasiswa() { return jenisBeasiswa; }
    public int getPenghasilanOrtu() { return penghasilanOrtu; }

    @Override
    public String toString() {
        return String.format("%-20s %-12s %-8.2f %-15s Rp %,d", 
            nama, nim, ipk, jenisBeasiswa, penghasilanOrtu);
    }
}

public class SistemBeasiswa {
    private static ArrayList<Pendaftar> daftarPendaftar = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    tambahDataPendaftar();
                    break;
                case 2:
                    tampilkanSemuaPendaftar();
                    break;
                case 3:
                    cariPendaftarBerdasarkanJenis();
                    break;
                case 4:
                    hitungRataIPK();
                    break;
                case 5:
                    System.out.println("\n=== Terima kasih telah menggunakan sistem ini ===");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }

            if (pilihan != 5) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }

        } while (pilihan != 5);

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("          SISTEM PENDAFTARAN BEASISWA");
        System.out.println("=".repeat(60));
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.println("=".repeat(60));
    }

    private static void tambahDataPendaftar() {
        System.out.println("\n=== TAMBAH DATA PENDAFTAR BEASISWA ===");

        // Input Nama
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        // Input NIM
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        // Input IPK dengan validasi
        double ipk = 0;
        boolean validIPK = false;
        while (!validIPK) {
            try {
                System.out.print("IPK terakhir (0.00 - 4.00): ");
                ipk = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                if (ipk < 0 || ipk > 4) {
                    System.out.println("IPK harus antara 0.00 dan 4.00!");
                } else {
                    validIPK = true;
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // clear buffer
            }
        }

        // Input Jenis Beasiswa dengan validasi
        String jenisBeasiswa = "";
        boolean validJenis = false;
        while (!validJenis) {
            System.out.println("\nJenis Beasiswa:");
            System.out.println("1. Reguler");
            System.out.println("2. Unggulan");
            System.out.println("3. Riset");
            System.out.print("Pilih jenis beasiswa (1-3): ");
            
            try {
                int pilihanJenis = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (pilihanJenis) {
                    case 1:
                        jenisBeasiswa = "Reguler";
                        validJenis = true;
                        break;
                    case 2:
                        jenisBeasiswa = "Unggulan";
                        validJenis = true;
                        break;
                    case 3:
                        jenisBeasiswa = "Riset";
                        validJenis = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Pilih 1-3.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid!");
                scanner.nextLine(); // clear buffer
            }
        }

        // Input Penghasilan Orang Tua dengan validasi
        int penghasilanOrtu = 0;
        boolean validPenghasilan = false;
        while (!validPenghasilan) {
            try {
                System.out.print("Penghasilan orang tua (maksimal 2000000): Rp ");
                penghasilanOrtu = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (penghasilanOrtu < 0) {
                    System.out.println("Penghasilan tidak boleh negatif!");
                } else if (penghasilanOrtu > 2000000) {
                    System.out.println("Penghasilan orang tua melebihi batas maksimal!");
                    System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal.");
                    return; // Keluar dari method
                } else {
                    validPenghasilan = true;
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // clear buffer
            }
        }

        // Tambahkan ke daftar
        Pendaftar pendaftar = new Pendaftar(nama, nim, ipk, jenisBeasiswa, penghasilanOrtu);
        daftarPendaftar.add(pendaftar);

        System.out.println("\n✓ Pendaftar berhasil disimpan. Total pendaftar: " + daftarPendaftar.size());
    }

    private static void tampilkanSemuaPendaftar() {
        System.out.println("\n=== TAMPILKAN SEMUA PENDAFTAR ===");

        if (daftarPendaftar.isEmpty()) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("\n" + "=".repeat(90));
        System.out.printf("%-4s %-20s %-12s %-8s %-15s %-20s\n", 
            "No", "Nama Mahasiswa", "NIM", "IPK", "Jenis Beasiswa", "Penghasilan Ortu");
        System.out.println("=".repeat(90));

        for (int i = 0; i < daftarPendaftar.size(); i++) {
            Pendaftar p = daftarPendaftar.get(i);
            System.out.printf("%-4d %-20s %-12s %-8.2f %-15s Rp %,d\n", 
                (i + 1), p.getNama(), p.getNim(), p.getIpk(), 
                p.getJenisBeasiswa(), p.getPenghasilanOrtu());
        }

        System.out.println("=".repeat(90));
        System.out.println("Total pendaftar: " + daftarPendaftar.size());
    }

    private static void cariPendaftarBerdasarkanJenis() {
        System.out.println("\n=== CARI PENDAFTAR BERDASARKAN JENIS BEASISWA ===");

        if (daftarPendaftar.isEmpty()) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        // Pilih jenis beasiswa
        System.out.println("\nJenis Beasiswa:");
        System.out.println("1. Reguler");
        System.out.println("2. Unggulan");
        System.out.println("3. Riset");
        System.out.print("Pilih jenis beasiswa (1-3): ");

        String jenisBeasiswa = "";
        try {
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    jenisBeasiswa = "Reguler";
                    break;
                case 2:
                    jenisBeasiswa = "Unggulan";
                    break;
                case 3:
                    jenisBeasiswa = "Riset";
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    return;
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            scanner.nextLine();
            return;
        }

        // Cari dan tampilkan
        ArrayList<Pendaftar> hasil = new ArrayList<>();
        for (Pendaftar p : daftarPendaftar) {
            if (p.getJenisBeasiswa().equals(jenisBeasiswa)) {
                hasil.add(p);
            }
        }

        System.out.println("\n=== Hasil Pencarian: " + jenisBeasiswa + " ===");

        if (hasil.isEmpty()) {
            System.out.println("Tidak ada pendaftar.");
        } else {
            System.out.println("\n" + "=".repeat(90));
            System.out.printf("%-4s %-20s %-12s %-8s %-20s\n", 
                "No", "Nama Mahasiswa", "NIM", "IPK", "Penghasilan Ortu");
            System.out.println("=".repeat(90));

            for (int i = 0; i < hasil.size(); i++) {
                Pendaftar p = hasil.get(i);
                System.out.printf("%-4d %-20s %-12s %-8.2f Rp %,d\n", 
                    (i + 1), p.getNama(), p.getNim(), p.getIpk(), p.getPenghasilanOrtu());
            }

            System.out.println("=".repeat(90));
            System.out.println("Total pendaftar " + jenisBeasiswa + ": " + hasil.size());
        }
    }

    private static void hitungRataIPK() {
        System.out.println("\n=== HITUNG RATA-RATA IPK PER JENIS BEASISWA ===");

        if (daftarPendaftar.isEmpty()) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }

        String[] jenisBeasiswa = {"Reguler", "Unggulan", "Riset"};
        boolean adaData = false;

        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%-15s %-15s %-15s\n", "Jenis Beasiswa", "Rata-rata IPK", "Jumlah Pendaftar");
        System.out.println("=".repeat(60));

        for (String jenis : jenisBeasiswa) {
            double totalIPK = 0;
            int jumlah = 0;

            for (Pendaftar p : daftarPendaftar) {
                if (p.getJenisBeasiswa().equals(jenis)) {
                    totalIPK += p.getIpk();
                    jumlah++;
                }
            }

            if (jumlah > 0) {
                double rataIPK = totalIPK / jumlah;
                System.out.printf("%-15s %-15.2f %-15d\n", jenis, rataIPK, jumlah);
                adaData = true;
            }
        }

        System.out.println("=".repeat(60));

        if (!adaData) {
            System.out.println("Tidak ada data untuk dihitung.");
        }
    }
}
// Destama Ardi saktiawan - 254107020185