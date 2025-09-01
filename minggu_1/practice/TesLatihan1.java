public class TesLatihan1 {
    public static void main(String[] args) {
        Tabungan tabungan1 = new Tabungan(5000);
        int ambil = 7300;

        System.out.println("Saldo awal: " + tabungan1.getSaldo());
        tabungan1.ambilUang(ambil);

        System.out.println("Jumlah yang diambil: " + ambil);
        System.out.println("Saldo sekarang: " + tabungan1.getSaldo());
    }
}






