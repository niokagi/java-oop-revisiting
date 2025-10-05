public class User {
    // 1. Enkapsulasi: Atribut dibuat private
    private String id;
    private String phone;
    private String username;
    private String password;

    // 2. Overloading Constructor
    // Constructor default (tanpa parameter)
    public User() {
    }

    // Constructor dengan parameter
    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    // --- Getters and Setters untuk Enkapsulasi ---
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 3. Overloading Method
    // Login menggunakan username dan password
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Login menggunakan phone dan password (nama sama, parameter beda)
    public boolean login(String phoneOrUsername, String password, boolean isPhone) {
        if (isPhone) {
            return this.phone.equals(phoneOrUsername) && this.password.equals(password);
        } else {
            return this.username.equals(phoneOrUsername) && this.password.equals(password);
        }
    }

    // Method dasar untuk di-override oleh subclass
    public void displayInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Phone: " + this.phone);
    }
}