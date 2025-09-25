package fifth_week.source_code.module_10.tasks;

public class Sepeda extends Kendaraan {
    protected String jmlSadel;
    protected int jmlGir;

    public Sepeda(int jmlRoda, String warna, String jmlSadel, int jmlGir) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public String getJmlSadel() {
        return this.jmlSadel;
    }

    public int getJmlGir() {
        return this.jmlGir;
    }
}



