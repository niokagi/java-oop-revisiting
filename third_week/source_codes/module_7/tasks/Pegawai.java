package third_week.source_codes.module_7.tasks;

public class Pegawai {
    public int nip;
    public String nama;

    public Pegawai(int nip_pegawai){ 
        this(nip_pegawai, "NoName"); 
    }
    public Pegawai(int nip_pegawai, String nama_pegawai) {
        this.nip = nip_pegawai;
        this.nama = nama_pegawai;
    }
}
