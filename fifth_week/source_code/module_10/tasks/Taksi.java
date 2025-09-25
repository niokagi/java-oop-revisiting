package fifth_week.source_code.module_10.tasks;

public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifAwal() {
        return this.tarifAwal;
    }

    public int getTarifPerKm() {
        return this.tarifPerKm;
    }
}