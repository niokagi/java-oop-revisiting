package third_week.source_codes.module_7.tries.sekolah;

// package sekolah;

public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    @Override
    public String toString() {
        return this.nama;
    }
}
