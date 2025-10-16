package practice_4;

class Pegawai {
    protected String nama;
    protected double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void tampilkanDetail() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gaji);
    }
}