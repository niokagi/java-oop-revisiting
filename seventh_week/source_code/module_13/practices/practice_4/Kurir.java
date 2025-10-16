package practice_4;

class Kurir extends Pegawai {
    private String wilayahKerja;

    public Kurir(String nama, double gaji, String wilayahKerja) {
        super(nama, gaji);
        this.wilayahKerja = wilayahKerja;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Wilayah Kerja: " + this.wilayahKerja);
    }
}
