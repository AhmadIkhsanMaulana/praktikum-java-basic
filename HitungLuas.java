import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukkan Panjang: ");
        int panjang = userInput.nextInt();

        System.out.println("Masukkan Lebar: ");
        int lebar = userInput.nextInt();

        int luas = hitungLuas(panjang, lebar);

        String jenisPersegiPanjang = tentukanJenisPersegiPanjang(luas);

        System.out.println(jenisPersegiPanjang);

        userInput.close();
    }

    private static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    private static String tentukanJenisPersegiPanjang(int luas) {
        if (luas % 2 == 0) {
            return "Even Rectangle";
        } else {
            return "Odd Rectangle";
        }
    }
}