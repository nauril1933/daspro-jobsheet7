import java.util.Scanner;
public class TarifParkir17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi; 
        int total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                    System.out.println("jenis kendaraan tidak valid! masukkan 1, 2, atau 0.");
            }
        } while (jenis != 0);

        System.out.println("total pembayaran parkir seluruh kendaraan: Rp " + total);
    }
}