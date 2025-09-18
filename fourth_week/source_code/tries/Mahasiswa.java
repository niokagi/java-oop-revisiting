// before encapsulation
// 
// public class Mahasiswa {
//     public int nrp;
//     public String nama;

//     public Mahasiswa(int nrp, String nama){
//         this.nrp = nrp;
//         this.nama = nama;
//     }
// }

// after encapsulation
// 
public class Mahasiswa {
    private int nrp; // privating attribute
    private String nama;

    public Mahasiswa(int nrp, String nama) {
        if (nrp <= 0) {
            throw new IllegalArgumentException("the nrp must be a positive integer");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("the name cannot be empty");
        }
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return this.nrp;
    }

    // adding setter & getter
    public String getNama() {
        return this.nama;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
