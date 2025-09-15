package third_week.source_codes.module_7.tries.sekolah;

import third_week.source_codes.module_7.tries.sekolah.Kelas;
import third_week.source_codes.module_7.tries.sekolah.Mahasiswa;

public class SekolahTester {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(2110191055, "Rina Wulandari");
        Kelas kelas = new Kelas(101, "D4-IT A");

        kelas.setMhs(mhs);

        System.out.println("Data Kelas :");
        System.out.println("Nama Kelas : " + kelas.getNamaKelas());
        System.out.println("Kode Kelas : " + kelas.getKodeKelas());
        System.out.println("Mahasiswa  : " + kelas.getMahasiswa());
    }
}
