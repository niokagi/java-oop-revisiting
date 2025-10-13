package seventh_week.source_code.module_13.tasks;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    // public int infoGaji() {
    //     return gaji;
    // }

    public int infoBonus() {
        return this.bonus;
    }
}
