// Name : Destama Ardi Saktiawan
// NIM  : 254107020185
// Class: Ti/1i

import java.util.Scanner;

public class SistemBeasiswa {
    static String[][] dataMhs = new String[100][5];
    static int jumlahData = 0;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n========================================");
            System.out.println("SISTEM PENDAFTARAN BEASISWA MAHASISWA");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Pendaftar Beasiswa");
            System.out.println("2. Tampilkan Semua Pendaftar");
            System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.println("========================================");
            System.out.print("PILIH MENU 1-5: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch(pilih) {
                case 1: tambahData(); break;
                case 2: tampilData(); break;
                case 3: cariData(); break;
                case 4: hitungRataIPK(); break;
                case 5: System.out.println("\nTerima kasih!"); break;
                default: System.out.println("Pilihan salah!");
            }
        } while(pilih != 5);
    }
    
    static void tambahData() {
        if(jumlahData >= 100) {
            System.out.println("Data sudah penuh!");
            return;
        }
        
        System.out.println("\n--- Tambah Data Pendaftar ---");
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        
        double ipk = 0;
        while(true) {
            System.out.print("IPK: ");
            ipk = sc.nextDouble();
            if(ipk >= 0 && ipk <= 4.0) break;
            System.out.println("IPK harus 0-4!");
        }
        sc.nextLine();
        
        String jenis = "";
        while(true) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenis = sc.nextLine().toUpperCase();
            if(jenis.equals("REGULER") || jenis.equals("UNGGULAN") || jenis.equals("RISET")) break;
            System.out.println("Jenis beasiswa tidak valid!");
        }
        
        int gaji = 0;
        while(true) {
            System.out.print("Penghasilan Orang Tua (maks 2000000): ");
            gaji = sc.nextInt();
            sc.nextLine();
            if(gaji <= 2000000 && gaji >= 0) break;
            System.out.println("Penghasilan melebihi batas!");
        }
        
        dataMhs[jumlahData][0] = nama;
        dataMhs[jumlahData][1] = nim;
        dataMhs[jumlahData][2] = String.valueOf(ipk);
        dataMhs[jumlahData][3] = jenis;
        dataMhs[jumlahData][4] = String.valueOf(gaji);
        jumlahData++;
        System.out.println("Data berhasil ditambahkan!");
    }
    
    static void tampilData() {
        System.out.println("\n--- Daftar Pendaftar Beasiswa ---");
        if(jumlahData == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        System.out.println("==============================================================================");
        System.out.printf("%-4s %-20s %-15s %-6s %-10s %-12s\n", 
            "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
        System.out.println("==============================================================================");
        
        for(int i = 0; i < jumlahData; i++) {
            System.out.printf("%-4d ", (i+1));
            for(int j = 0; j < 5; j++) {
                String[] format = {"%-20s ", "%-15s ", "%-6s ", "%-10s ", "Rp%-10s"};
                System.out.printf(format[j], dataMhs[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============================================================================");
    }
    
    static void cariData() {
        System.out.println("\n--- Cari Data Berdasarkan Jenis Beasiswa ---");
        if(jumlahData == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        System.out.print("Masukkan jenis beasiswa: ");
        String cari = sc.nextLine().toUpperCase();
        
        System.out.println("\nHasil Pencarian:");
        System.out.println("==============================================================================");
        System.out.printf("%-4s %-20s %-15s %-6s %-10s %-12s\n", 
            "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
        System.out.println("==============================================================================");
        
        int no = 1, ketemu = 0;
        for(int i = 0; i < jumlahData; i++) {
            if(dataMhs[i][3].equals(cari)) {
                System.out.printf("%-4d ", no++);
                for(int j = 0; j < 5; j++) {
                    String[] format = {"%-20s ", "%-15s ", "%-6s ", "%-10s ", "Rp%-10s"};
                    System.out.printf(format[j], dataMhs[i][j]);
                }
                System.out.println();
                ketemu++;
            }
        }
        
        if(ketemu == 0) System.out.println("Data tidak ditemukan");
        System.out.println("==============================================================================");
    }
    
    static void hitungRataIPK() {
        System.out.println("\n--- Rata-rata IPK per Jenis Beasiswa ---");
        if(jumlahData == 0) {
            System.out.println("Belum ada data");
            return;
        }
        
        String[] jenisBeasiswa = {"REGULER", "UNGGULAN", "RISET"};
        System.out.println("=========================================");
        
        for(int i = 0; i < jenisBeasiswa.length; i++) {
            double total = 0;
            int jumlah = 0;
            for(int j = 0; j < jumlahData; j++) {
                if(dataMhs[j][3].equals(jenisBeasiswa[i])) {
                    total += Double.parseDouble(dataMhs[j][2]);
                    jumlah++;
                }
            }
            
            if(jumlah > 0) {
                System.out.printf("%-9s: %.2f (dari %d mahasiswa)\n", 
                    jenisBeasiswa[i], total/jumlah, jumlah);
            } else {
                System.out.printf("%-9s: tidak ada data\n", jenisBeasiswa[i]);
            }
        }
        System.out.println("=========================================");
    }
}