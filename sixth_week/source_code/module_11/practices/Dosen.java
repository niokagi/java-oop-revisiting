public class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    // Overloading Constructor
    public Dosen() {
    }

    public Dosen(String username, String password, String phone) {
        super(username, password, phone);
    }

    // Getters and Setters
    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean login(String username, String password, String key) {
        boolean isUserValid = super.login(username, password);
        return isUserValid && this.key.equals(key);
    }

    @Override
    public void displayInfo() {
        System.out.println("Info Dosen: ");
        super.displayInfo();
        System.out.println("Pangkat/Golongan: " + this.pangkat + "/" + this.golongan);
    }
}