package perbankan;

public class PenyimpananUang extends Tabungan {
    private double tingkatBunga;

    public PenyimpananUang(int saldo, double tingkatBunga) {
        super(saldo);
        this.tingkatBunga = tingkatBunga;
    }

    public double cekUang() {
        double bunga = saldo * this.tingkatBunga;
        return saldo + bunga;
    }
}