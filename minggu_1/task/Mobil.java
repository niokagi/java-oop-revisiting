public class Mobil {
    String merek;
    String warna;
    String tipe;
    int kapasitasMesin;
    int kapasitasPenumpang;

    public Mobil(String merek, String warna, String tipe, int kapasitasMesin, int kapasitasPenumpang) {
        this.merek = merek;
        this.warna = warna;
        this.tipe = tipe;
        this.kapasitasMesin = kapasitasMesin;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String infoMobil(int nomor) {
        String format = "| %-3d | %-10s | %-8s | %-10s | %-17s | %-20s |";

        String mesinStr = this.kapasitasMesin + " cc";
        String penumpangStr = this.kapasitasPenumpang + " orang";

        return String.format(format, nomor, this.merek, this.warna, this.tipe, mesinStr, penumpangStr);
    }
}





