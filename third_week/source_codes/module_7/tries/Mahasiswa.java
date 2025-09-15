package third_week.source_codes.module_7.tries;

public class Mahasiswa {
    public int nrp;
    public String nama;

    public Mahasiswa() {
        this(0, "");
    }

    public Mahasiswa(String nama) {
        this(0, nama);
    }

    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
}

// public class Mahasiswa {
// public int nrp;
// public String nama;

// public Mahasiswa(int nrp, String nama) {
// this.nrp = nrp;
// this.nama = nama;
// }
// }
