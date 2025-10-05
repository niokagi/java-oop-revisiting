package sixth_week.source_code.module_12.practices.Uml_Implement;

public class Dosen extends Orang {
    private int nip;

    public Dosen(String nama) {
        super(nama);
    }

    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }

    public void Info() {
        System.out.println("Nama : " + this.nama);
        if (this.nip == 0) {
            System.out.println("NIP : -");
        } else {
            System.out.println("NIP : " + this.nip);
        }

        if (this.umur == 0) {
            System.out.println("Umur : -");
        } else {
            System.out.println("Umur : " + this.umur);
        }
    }
}
