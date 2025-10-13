package seventh_week.source_code.module_13.tasks;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int infoTunjangan(){
        return this.tunjangan;
    }
}
