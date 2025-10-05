public class Mahasiswa extends User {
    private String kelas;
    private Dosen dosenWali;

    public Mahasiswa() {
	// automatically call super() 
    }

    public Mahasiswa(String username, String password, String phone) {
        super(username, password, phone);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // 4. Overriding Method
    @Override
    public void displayInfo() {
        System.out.println("Info Mahasiswa:");
        super.displayInfo();        
	System.out.println("Kelas: " + this.kelas);
        if (this.dosenWali != null) {
            System.out.println("Dosen Wali: " + this.dosenWali.getUsername());
        }
    }
}