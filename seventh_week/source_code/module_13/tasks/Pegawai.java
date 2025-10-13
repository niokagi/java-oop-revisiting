package seventh_week.source_code.module_13.tasks;

public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji(){
        return this.gaji;
    }

}
