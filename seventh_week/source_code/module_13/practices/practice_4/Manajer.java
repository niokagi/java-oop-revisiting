package practice_4;

class Manajer extends Pegawai {
    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Departemen: " + this.departemen);
    }
}
