
import java.util.Scanner;

public class ArrayNilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[10];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);

            if (nilai[i] >= 70) {
                System.out.println(" (LULUS)");
            } else {
                System.out.println(" (TIDAK LULUS)");
            }
        }

        input.close();
    }
}
