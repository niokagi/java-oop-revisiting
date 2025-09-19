package fourth_week.source_code.tasks;

import java.util.Scanner;

public class TesMultiTabungan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiTabungan tabungan = new MultiTabungan(100000);

        while (true) {
            System.out.println("\nMENU TABUNGAN: ");
            System.out.println("1. Lihat Saldo (IDR)");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("Saldo anda: " + tabungan.getSaldo() + " IDR");
            } else if (menu == 2) {
                System.out.print("Masukkan jumlah: ");
                int jumlah = sc.nextInt();
                System.out.print("Masukkan mata uang (IDR/USD/AUD): ");
                String cur = sc.next();
                tabungan.simpanUang(jumlah, cur);
                System.out.println("Saldo sekarang: " + tabungan.getSaldo() + " IDR");
            } else if (menu == 3) {
                System.out.print("Masukkan jumlah: ");
                int jumlah = sc.nextInt();
                System.out.print("Masukkan mata uang (IDR/USD/AUD): ");
                String cur = sc.next();
                boolean ok = tabungan.ambilUang(jumlah, cur);
                if (ok) {
                    System.out.println("Penarikan berhasil.");
                } else {
                    System.out.println("Penarikan gagal.");
                }
                System.out.println("Saldo sekarang: " + tabungan.getSaldo() + " IDR");
            } else if (menu == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }
        }

        sc.close();
    }
}
