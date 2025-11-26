import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        
        System.out.print("Masukkan nama makanan yang ingin Anda cari: ");
        String cariMenu = input.nextLine();

        
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                break;
            }
        }

        
        System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
            System.out.println(" Menu \"" + cariMenu + "\" tersedia di kafe.");
        } else {
            System.out.println(" Maaf, menu \"" + cariMenu + "\" tidak tersedia.");
        }
    }


}