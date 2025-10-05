package sixth_week.source_code.module_12.tasks.task_two;

public class Kecebong extends Katak {
    private double panjangEkor;

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }

    @Override
    public String caraBergerak() {
        return "berenang";
    }

    public double getPanjangEkor() {
        return panjangEkor;
    }
}
