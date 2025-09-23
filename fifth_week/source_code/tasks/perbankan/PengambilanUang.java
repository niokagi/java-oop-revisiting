package fifth_week.source_code.tasks.perbankan;

public class PengambilanUang extends Tabungan {
    private int proteksi;

    public PengambilanUang(int saldo) {
        super(saldo);
        this.proteksi = 0;
    }

    public PengambilanUang(int saldo, int proteksi) {
        super(saldo);
        this.proteksi = proteksi;
    }

    public boolean ambilUang(int jumlah) {
        if ((this.saldo - jumlah) >= this.proteksi) {
            this.saldo -= jumlah;
            return true;
        }
        return false;
    }
}