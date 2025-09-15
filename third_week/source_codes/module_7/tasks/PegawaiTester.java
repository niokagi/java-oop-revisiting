package third_week.source_codes.module_7.tasks;

public class PegawaiTester {
    public static void main(String args[]) {
        Pegawai pegawai1 = new Pegawai(12345);
        Pegawai pegawai2 = new Pegawai(54321, "Budi");

        System.out.println("Data Pegawai 1:");
        System.out.println("NIP: " + pegawai1.nip + ", Nama: " + pegawai1.nama);

        System.out.println("\nData Pegawai 2:");
        System.out.println("NIP: " + pegawai2.nip + ", Nama: " + pegawai2.nama);
    }
}