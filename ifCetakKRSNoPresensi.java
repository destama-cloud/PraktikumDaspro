public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        int presensi = 80; // contoh input presensi

        // Versi IF-ELSE
        if (presensi >= 75) {
            System.out.println("KRS Anda disetujui.");
        } else {
            System.out.println("KRS Anda tidak disetujui karena presensi kurang dari 75%.");
        }

        // Versi Ternary Operator (transformasi dari IF-ELSE)
        String hasil = (presensi >= 75)
            ? "KRS Anda disetujui."
            : "KRS Anda tidak disetujui karena presensi kurang dari 75%.";

        System.out.println(hasil);
    }
}
