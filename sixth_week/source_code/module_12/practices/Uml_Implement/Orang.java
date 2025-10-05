package sixth_week.source_code.module_12.practices.Uml_Implement;

// File ini bisa ditempatkan sesuai struktur package Anda, misal:
// package sixth_week.source_code.module_12.practices.Uml_Implement;

public class Orang {
    // Sesuai diagram, modifier '#' berarti protected
    protected String nama;
    protected int umur;

    // Constructor Overloading (1)
    public Orang(String nama) {
        this.nama = nama;
        // 'umur' akan otomatis terinisialisasi dengan nilai default int, yaitu 0
    }

    // Constructor Overloading (2)
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}