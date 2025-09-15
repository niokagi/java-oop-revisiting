package third_week.source_codes.module_7.tries.sekolah;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }

    public String getNamaKelas() {
        return this.namakelas;
    }

    public int getKodeKelas() {
        return this.kodekelas;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }
}
