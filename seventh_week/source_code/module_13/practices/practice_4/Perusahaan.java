package practice_4;

public class Perusahaan {

    public static void prosesDataPegawai(Pegawai p) {
        System.out.println("Data Karyawan:");
        p.tampilkanDetail();
        System.out.println();
    }

    public static void main(String[] args) {
        Manajer manajer = new Manajer("Budi Santoso", 15000000, "Teknologi Informasi");
        Kurir kurir = new Kurir("Eko Prasetyo", 5000000, "Surabaya Pusat");

        prosesDataPegawai(manajer);
        prosesDataPegawai(kurir);
    }
}
