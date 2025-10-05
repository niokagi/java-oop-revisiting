package sixth_week.source_code.module_12.tasks.task_two;

public class Katak {
    private int umur;
    private String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public String caraBergerak() {
        return "melompat";
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}