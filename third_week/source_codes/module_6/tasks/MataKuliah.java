package third_week.source_codes.module_6.tasks;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    public String dosenPengampu;

    public MataKuliah(String kode, String nama, int sks, String dosen) {
        this.kodeMK = kode;
        this.namaMK = nama;
        this.sks = sks;
        this.dosenPengampu = dosen;
    }

    public String getInfoMataKuliah() {
        return "MK: " + this.namaMK + " (" + this.kodeMK + ") - " + this.sks + " SKS";
    }

    public int getSks() {
        return this.sks;
    }
}
