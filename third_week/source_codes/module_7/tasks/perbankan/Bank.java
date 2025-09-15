package third_week.source_codes.module_7.tasks.perbankan;

// package perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
        this.nasabah = new Nasabah[10];
        this.jumlahNasabah = 0;
    }
    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if (jumlahNasabah < nasabah.length) {
            nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
            jumlahNasabah++;
        } else {
            System.out.println("Kapasitas bank sudah penuh.");
        }
    }
    public int getJumlahNasabah() {
        return this.jumlahNasabah;
    }
    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return nasabah[indeks];
        }
        return null;
    }
}
