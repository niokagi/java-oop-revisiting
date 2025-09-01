public class Tabungan {
    int saldo;

    public Tabungan(int initsaldo) {
        this.saldo = initsaldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int simpanUang(int jumlah) {
        this.saldo += jumlah;
        return this.saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah > this.saldo) {
            return false;
        } else {
            this.saldo -= jumlah;
            return true;
        }
    }
}
