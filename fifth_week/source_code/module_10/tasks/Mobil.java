package fifth_week.source_code.module_10.tasks;

public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda, warna);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public String getBahanBakar() {
        return this.bahanBakar;
    }

    public int getKapasitasMesin() {
        return this.kapasitasMesin;
    }
}