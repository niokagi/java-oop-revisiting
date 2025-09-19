package fourth_week.source_code.practices;

public class Truk {
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks) {
        this.muatanmaks = beratmaks;
        this.muatan = 0.0;
    }

    public double getMuatan() {
        return this.muatan;
    }

    public double getMuatanMaks() {
        return muatanmaks;
    }

    public boolean tambahMuatan(double berat) {
        if (muatan + berat <= muatanmaks) {
            muatan += berat;
            return true;
        } else {
            return false;
        }
    }

    public double newtsToKilo(double berat) {
        return berat / 9.8;
    }

    public double kiloToNewts(double berat) {
        return berat * 9.8;
    }
}
