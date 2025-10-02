package pbo_paradigm;

public class Main {
    public static void main(String[] args) {
        Lingkaran ling1 = new Lingkaran(10.0);

        System.out.println("Data Jari-jari: " + ling1.getJariJari());
        System.out.printf("Luas lingkaran: %.2f\n", ling1.hitungLuas());
    }
}
