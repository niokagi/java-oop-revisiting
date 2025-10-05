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

    // Method login spesifik untuk Dosen (bukan override/overload dari User)
    public boolean login(String username, String password, String key) {
        // Memanfaatkan method login dari superclass dan menambahkan validasi key
        boolean isUserValid = super.login(username, password);
        return isUserValid && this.key.equals(key);
    }

    // 4. Overriding Method
    @Override
    public void displayInfo() {
        System.out.println("--- Info Dosen ---");
        super.displayInfo(); // Memanggil method dari superclass
        System.out.println("Pangkat/Golongan: " + this.pangkat + "/" + this.golongan);
    }
}