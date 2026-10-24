import java.util.Scanner;
public class TiketBioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiketTerjual = 0;
        double totalHargaPenjualan = 0;
        double subTotal, diskon, totalBayar;

        System.out.println("- Program penjualan tiket bioskop -");
        System.out.println("Ketik jumlah tiket negatif untuk mengahiri transaksi dan melihat rekap.");

        while (true) {
            System.out.print("Masukkan jumlah tiket dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                break;
            }

            if (jumlahTiket == 0) { 
                System.out.println("Jumlah tiket tidak valid. silakan masukkan lagi!");
                continue;
            }

            subTotal = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalBayar = subTotal - (subTotal * diskon);
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalBayar;

            System.out.println("subTotal: Rp " + subTotal);
            if (diskon > 0) {
                System.out.println("Anda mendapat diskon " + (int)(diskon * 100) + "%");
            }
            System.out.println("Total yang harus di bayar: Rp " + totalBayar);
        }

        System.out.println("Rekapitulasi harian penjualan tiket");
        System.out.println("Total seluruh tiket yang terjual: " + totalTiketTerjual);
        System.out.println("Total harga penjualan tiket: Rp " + totalHargaPenjualan);
    }
}