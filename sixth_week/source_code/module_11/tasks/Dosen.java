package sixth_week.source_code.module_11.tasks;

public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen(String username, String password, String phone, String pangkat, String golongan, String key) {
        super(username, password, phone);
        this.pangkat = pangkat;
        this.golongan = golongan;
        this.key = key;
    }

    public boolean login(String username, String password, String key) {
        boolean isUserValid = super.login(username, password);
        if (this.key == null)
            return false;
        return isUserValid && this.key.equals(key);
    }

    @Override
    public void displayInfo() {
        System.out.println("Info Dosen:");
        super.displayInfo();
        System.out.println("Pangkat/Golongan: " + this.pangkat + "/" + this.golongan);
    }
}
