package fifth_week.source_code.module_10.tasks;

public class Tes {
    public static void main(String[] args) {
        Truk truk1 = new Truk(4, "kuning", "solar", 1500, 1000);
        Truk truk2 = new Truk(6, "merah", "solar", 2000, 5000);
        Taksi taksi1 = new Taksi(4, "oranye", "bensin", 1500, 10000, 5000);
        Taksi taksi2 = new Taksi(4, "biru", "bensin", 1300, 7000, 3500);
        Sepeda sepeda1 = new Sepeda(3, "hitam", "1", 2);
        Sepeda sepeda2 = new Sepeda(2, "putih", "2", 5);

        System.out.println("# Data Truk 1: ");
        System.out.println("Jumlah Roda: " + truk1.getJmlRoda());
        System.out.println("Warna: " + truk1.getWarna());
        System.out.println("Bahan Bakar: " + truk1.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk1.getKapasitasMesin());
        System.out.println("Muatan Maksimal: " + truk1.getMuatanMaks());

        System.out.println("\n# Data Truk 2: ");
        System.out.println("Jumlah Roda: " + truk2.getJmlRoda());
        System.out.println("Warna: " + truk2.getWarna());
        System.out.println("Bahan Bakar: " + truk2.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk2.getKapasitasMesin());
        System.out.println("Muatan Maksimal: " + truk2.getMuatanMaks());

        System.out.println("\n# Data Taksi 1: ");
        System.out.println("Jumlah Roda: " + taksi1.getJmlRoda());
        System.out.println("Warna: " + taksi1.getWarna());
        System.out.println("Bahan Bakar: " + taksi1.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi1.getKapasitasMesin());
        System.out.println("Tarif Awal: " + taksi1.getTarifAwal());
        System.out.println("Tarif Per Km: " + taksi1.getTarifPerKm());

        System.out.println("\n# Data Taksi 2: ");
        System.out.println("Jumlah Roda: " + taksi2.getJmlRoda());
        System.out.println("Warna: " + taksi2.getWarna());
        System.out.println("Bahan Bakar: " + taksi2.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi2.getKapasitasMesin());
        System.out.println("Tarif Awal: " + taksi2.getTarifAwal());
        System.out.println("Tarif Per Km: " + taksi2.getTarifPerKm());

        System.out.println("\n# Data Sepeda 1: ");
        System.out.println("Jumlah Roda: " + sepeda1.getJmlRoda());
        System.out.println("Warna: " + sepeda1.getWarna());
        System.out.println("Jumlah Sadel: " + sepeda1.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda1.getJmlGir());

        System.out.println("\n# Data Sepeda 2: ");
        System.out.println("Jumlah Roda: " + sepeda2.getJmlRoda());
        System.out.println("Warna: " + sepeda2.getWarna());
        System.out.println("Jumlah Sadel: " + sepeda2.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda2.getJmlGir());
    }
}



