package third_week.source_codes.tasks;

public class RegistStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private char nilaiHuruf;

    public RegistStudi(Mahasiswa mhs, MataKuliah mk) {
        this.mahasiswa = mhs;
        this.mataKuliah = mk;
        this.nilaiHuruf = '-';
    }

    public void inputNilai(char nilai) {
        char upperNilai = Character.toUpperCase(nilai);
        if (upperNilai >= 'A' && upperNilai <= 'E') {
            this.nilaiHuruf = upperNilai;
            System.out
                    .println("Nilai untuk " + mataKuliah.getInfoMataKuliah() + " telah diinput: " + this.nilaiHuruf);
        } else {
            System.out.println("Format nilai tidak valid (harus A-E).");
        }
    }

    public double hitungBobotNilai() {
        switch (this.nilaiHuruf) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'E':
                return 0.0;
            default:
                return 0.0;
        }
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Detail Registrasi Studi");
        System.out.println("Mahasiswa   : " + mahasiswa.getNama() + " (" + mahasiswa.getNim() + ")");
        System.out.println("Mata Kuliah : " + mataKuliah.getInfoMataKuliah());
        System.out.println("Dosen       : " + mataKuliah.dosenPengampu);
        // System.out.println("Nilai Akhir : " + this.nilaiHuruf + " (Bobot: " + hitungBobotNilai() + ")");
    }

    public boolean validasiRegistrasi(double ipkMhs, int sksMk) {
        if (ipkMhs < 3.0 && sksMk > 3) {
            System.out.println(
                    "VALIDASI GAGAL: IPK di bawah 3.0 tidak dapat mengambil mata kuliah " + sksMk + " SKS.");
            return false;
        }
        System.out.println("VALIDASI BERHASIL: Mahasiswa dapat mengambil mata kuliah ini.");
        return true;
    }
}
