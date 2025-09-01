public class Tabungan {
    private int saldo;

    public Tabungan(int i) {
        saldo = i;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
            return false;
        } else {
            this.saldo = saldo - jumlah;
            return true;
        }

    }

    public int getSaldo() {
        return this.saldo;
    }
}





