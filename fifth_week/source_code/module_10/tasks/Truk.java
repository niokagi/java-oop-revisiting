package fifth_week.source_code.module_10.tasks;

public class Truk extends Mobil {
    protected int muatanMaks;

    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }

    public int getMuatanMaks() {
        return this.muatanMaks;
    }
}