public class Truk {
    double muatan;
    double muatanmaks;

    public Truk(double beratMax){
        this.muatanmaks = beratMax;
    }
    
    public double getMuatan(){
        return this.muatan;
    }

    public double getMuatanMaks(){
        return this.muatanmaks;
    }

    public double tambahMuatan(double berat){
        this.muatan += berat;
        return this.muatan;
    }
}





