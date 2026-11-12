import java.util.Scanner;

public class tugas105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = scanner.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        double rataRata = (double) total / jumlah;

        System.out.println("\n========================================");
        System.out.println("           RINGKASAN NILAI              ");
        System.out.println("========================================");
        System.out.println("Nilai Rata-rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);

        System.out.println("\n========================================");
        System.out.println("      DAFTAR KELULUSAN MAHASISWA          ");
        System.out.println("========================================");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] >= 60) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " | Nilai: " + nilai[i] + " | Status: " + status);
        }

        scanner.close();
    }
}