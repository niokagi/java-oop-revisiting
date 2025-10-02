package pbo_paradigm;

public class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
}
