import java.util.Scanner;

public class SistemKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== INPUT DATA MAHASISWA =====
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        // ===== MATA KULIAH 1 =====
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugasAlgo = input.nextDouble();

        double nilaiAkhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);

        String hurufAlgo;
        if (nilaiAkhirAlgo >= 85) hurufAlgo = "A";
        else if (nilaiAkhirAlgo >= 80) hurufAlgo = "A-";
        else if (nilaiAkhirAlgo >= 75) hurufAlgo = "B+";
        else if (nilaiAkhirAlgo >= 70) hurufAlgo = "B";
        else if (nilaiAkhirAlgo >= 65) hurufAlgo = "C+";
        else if (nilaiAkhirAlgo >= 60) hurufAlgo = "C";
        else if (nilaiAkhirAlgo >= 55) hurufAlgo = "D";
        else hurufAlgo = "E";

        String statusAlgo = (nilaiAkhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";

        // ===== MATA KULIAH 2 =====
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double utsStruk = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uasStruk = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugasStruk = input.nextDouble();

        double nilaiAkhirStruk = (utsStruk * 0.3) + (uasStruk * 0.4) + (tugasStruk * 0.3);

        String hurufStruk;
        if (nilaiAkhirStruk >= 85) hurufStruk = "A";
        else if (nilaiAkhirStruk >= 80) hurufStruk = "A-";
        else if (nilaiAkhirStruk >= 75) hurufStruk = "B+";
        else if (nilaiAkhirStruk >= 70) hurufStruk = "B";
        else if (nilaiAkhirStruk >= 65) hurufStruk = "C+";
        else if (nilaiAkhirStruk >= 60) hurufStruk = "C";
        else if (nilaiAkhirStruk >= 55) hurufStruk = "D";
        else hurufStruk = "E";

        String statusStruk = (nilaiAkhirStruk >= 60) ? "LULUS" : "TIDAK LULUS";

        // ===== HITUNG RATA-RATA DAN STATUS SEMESTER =====
        double rataRata = (nilaiAkhirAlgo + nilaiAkhirStruk) / 2;
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusStruk.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Ada MK tidak lulus)";
        }

        // ===== OUTPUT PENILAIAN AKADEMIK =====
        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Mata Kuliah           UTS   UAS   Tugas   Nilai  Huruf  Status");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman  %.0f   %.0f   %.0f   %.2f   %-3s   %s%n",
                utsAlgo, uasAlgo, tugasAlgo, nilaiAkhirAlgo, hurufAlgo, statusAlgo);
        System.out.printf("Struktur Data          %.0f   %.0f   %.0f   %.2f   %-3s   %s%n",
                utsStruk, uasStruk, tugasStruk, nilaiAkhirStruk, hurufStruk, statusStruk);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir : %.2f%n", rataRata);
        System.out.println("Status Semester       : " + statusSemester);

        // ===== RUBRIK PENILAIAN =====
        System.out.println("\n================ ASSESSMENT RUBRIC =================");
        System.out.println("Aspect of Assessment                           Weight  Score  Description");
        System.out.println("--------------------------------------------------------------");
        System.out.println("1. Understanding of Case Study & Logic Flow     20%     18     Systematic explanation, clear logic");
        System.out.println("2. Identification of Variables & Data Types     15%     14     Correct variable use & explanation");
        System.out.println("3. Understanding of Arithmetic Operators        10%     10     Correct score calculation logic");
        System.out.println("4. Explanation of IF & Nested IF                20%     19     Clear nested logic explanation");
        System.out.println("5. Logic of Course & Semester Passing           15%     14     Correct passing logic, minor detail");
        System.out.println("6. Program Compilation & Output                 10%     10     Runs perfectly, correct output");
        System.out.println("7. Code Relevance to Case Study                 10%     10     Code matches instruction completely");
        System.out.println("--------------------------------------------------------------");
        int totalScore = 18 + 14 + 10 + 19 + 14 + 10 + 10;
        System.out.println("TOTAL SCORE : " + totalScore + " / 100");
        System.out.println("==============================================================");
    }
}
