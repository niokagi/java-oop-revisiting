package fourth_week.source_code.tasks;

public class MultiTabungan {
    private int saldo;
    private static final int USD_TO_IDR = 9000;
    private static final int AUD_TO_IDR = 10000;

    public MultiTabungan(int initsaldo) {
        this.saldo = initsaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah, String currency) {
        switch (currency.toUpperCase()) {
            case "USD":
                saldo += jumlah * USD_TO_IDR;
                break;
            case "AUD":
                saldo += jumlah * AUD_TO_IDR;
                break;
            case "IDR":
                saldo += jumlah;
                break;
            default:
                System.out.println("Mata uang tidak dikenal: " + currency);
        }
    }

    public boolean ambilUang(int jumlah, String currency) {
        int konversi = 0;
        switch (currency.toUpperCase()) {
            case "USD":
                konversi = jumlah * USD_TO_IDR;
                break;
            case "AUD":
                konversi = jumlah * AUD_TO_IDR;
                break;
            case "IDR":
                konversi = jumlah;
                break;
            default:
                System.out.println("Mata uang tidak dikenal: " + currency);
                return false;
        }

        if (saldo >= konversi) {
            saldo -= konversi;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi!");
            return false;
        }
    }
}
