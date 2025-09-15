package third_week.source_codes.module_7.tries;

public class MahasiswaTester {
    public static void main(String[] args) {
        // construct without args
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Objek mhs1 (tanpa argumen):");
        System.out.println("Nama: " + mhs1.nama + ", NRP: " + mhs1.nrp);
        System.out.println("---------------------------------");

        // construct 1 args
        Mahasiswa mhs2 = new Mahasiswa("Nana Hoshi");
        System.out.println("Objek mhs2 (dengan 1 argumen):");
        System.out.println("Nama: " + mhs2.nama + ", NRP: " + mhs2.nrp);
        System.out.println("---------------------------------");

        // construct 2 args
        Mahasiswa mhs3 = new Mahasiswa(2110191050, "David Setyawan");
        System.out.println("Objek mhs3 (dengan 2 argumen):");
        System.out.println("Nama: " + mhs3.nama + ", NRP: " + mhs3.nrp);
    }
}

// public class MahasiswaTester {
// public static void main(String[] args) {
// Mahasiswa mhs1 = new Mahasiswa(109, "Adhim N");

// System.out.println("Data Mahasiswa:");
// System.out.println("Nama:" + mhs1.nama);
// System.out.println("NRP:" + mhs1.nrp);
// }
// }
