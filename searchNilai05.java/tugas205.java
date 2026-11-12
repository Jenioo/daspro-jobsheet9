import java.util.Scanner;

public class tugas205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("========================================");
        System.out.println("         DAFTAR MENU CAFE KAMPUS        ");
        System.out.println("========================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("========================================\n");
        System.out.print("Cari menu (masukkan nama makanan/minuman): ");
        String cariMenu = scanner.nextLine();
        int indeksKetemu = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeksKetemu = i;
                break;
            }
        }

        if (indeksKetemu != -1) {
            System.out.println("-> Menu \"" + menu[indeksKetemu] + "\" tersedia dengan harga Rp " + harga[indeksKetemu] + "\n");
        } else {
            System.out.println("-> Maaf, menu \"" + cariMenu + "\" tidak tersedia.\n");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = scanner.nextLine();

                int posisiMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        posisiMenu = j;
                        break;
                    }
                }
                if (posisiMenu != -1) {
                    daftarPesanan[i] = menu[posisiMenu];
                    hargaPesanan[i] = harga[posisiMenu];
                    totalBiaya += harga[posisiMenu];
                    valid = true;
                } else {
                    System.out.println("Menu tidak tersedia di daftar! Silakan masukkan kembali[cite: 3].");
                }
            }
        }
        System.out.println("\n========================================");
        System.out.println("            STRUK PEMESANAN             ");
        System.out.println("========================================");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.printf("%-15s : Rp %d\n", daftarPesanan[i], hargaPesanan[i]);
        }
        System.out.println("----------------------------------------");
        System.out.printf("%-15s : Rp %d\n", "TOTAL BIAYA", totalBiaya);
        System.out.println("========================================");

        scanner.close();
    }
}