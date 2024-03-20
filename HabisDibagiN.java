import java.util.Scanner;

public class HabisDibagiN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Angka: ");
        int jumlahAngka = userInput.nextInt();

        System.out.println("Masukkan Nilai n: ");
        int n = userInput.nextInt();

       tampilkanAngkaHabisBagiN(jumlahAngka, n);

       userInput.close();
    }

    private static void tampilkanAngkaHabisBagiN(int jumlahAngka, int n) {
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0 && i <= jumlahAngka * n) {
                System.out.println(i);
            }
        }
    }
}
