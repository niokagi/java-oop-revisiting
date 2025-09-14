package third_week.source_codes.module_6.tasks;

public class Mahasiswa {
    private String nama;
    private String nim;
    protected double ipk;
    static String universitas = "PENS";

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = 0.0;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double newIPK) {
        if (newIPK >= 0.0 && newIPK <= 4.0) {
            this.ipk = newIPK;
            System.out.println("IPK: " + this.ipk);
        } else {
            System.out.println("IPK tidak valid.");
        }
    }

    public void belajar() {
        System.out.println("" + this.nama + " sedang belajar.");
    }

    public String printDataDiri() {
        return "Nama: " + this.nama + "\nNIM: " + this.nim + "\nKampus asal: " + universitas;
    }
}