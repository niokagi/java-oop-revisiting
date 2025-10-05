package sixth_week.source_code.module_11.tasks;

public class Mahasiswa extends User {
    private String kelas;
    private Dosen dosenWali;

    public Mahasiswa(String username, String password, String phone, String kelas) {
        super(username, password, phone);
        this.kelas = kelas;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    @Override
    public void displayInfo() {
        System.out.println("Info Mahasiswa:");
        super.displayInfo();
        System.out.println("Kelas: " + this.kelas);
        if (this.dosenWali != null) {
            System.out.println("Dosen Wali: " + this.dosenWali.getUsernameInternal());
        }
    }
}
