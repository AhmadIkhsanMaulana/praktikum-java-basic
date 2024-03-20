import java.util.Scanner;

public class PengirimanPaket {
    private static final int getBiayaPaket1 = 10000;
    private static final int getBiayaPaket2 = 15000;
    private static final int getBiayaPaket3 = 25000;
    private static final int getBiayaPaket4 = 40000;

    private static final int getBiayaJarak1 = 2000;
    private static final int getBiayaJarak2 = 5000;
    private static final int getBiayaJarak3 = 10000;
    private static final int getBiayaJarak4 = 20000;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukkan Berat Paket (Kg): ");
        int beratPaket = userInput.nextInt();

        System.out.println("Masukkan Jarak Tempuh (Km): ");
        int jarakTempuh = userInput.nextInt();

        int biayaPaket = hitungBiayaPaket(beratPaket);
        int biayaJarak = hitungBiayaJarak(jarakTempuh);

        int totalBiaya = biayaPaket + biayaJarak;

        System.out.println("Biaya Pengiriman: Rp" + totalBiaya);

        userInput.close();
    }

    private static int hitungBiayaPaket(int beratPaket) {
        if (beratPaket < 2) {
            return getBiayaPaket1;
        } else if (beratPaket <= 7) {
            return getBiayaPaket2;
        } else if (beratPaket <= 15) {
            return getBiayaPaket3;
        } else {
            return getBiayaPaket4;
        }
    }

    private static int hitungBiayaJarak(int jarakTempuh) {
        if (jarakTempuh < 1) {
            return getBiayaJarak1;
        } else if (jarakTempuh <= 7) {
            return getBiayaJarak2;
        } else if (jarakTempuh <= 15) {
            return getBiayaJarak3;
        } else {
            return getBiayaJarak4;
        }
    }

}
