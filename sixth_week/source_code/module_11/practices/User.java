public class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

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

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean login(String phoneOrUname, String password, boolean isPhone) {
        if (isPhone) {
            return this.phone.equals(phoneOrUname) && this.password.equals(password);
        } else {
            return this.username.equals(phoneOrUname) && this.password.equals(password);
        }
    }

    public void displayInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Phone: " + this.phone);
    }
}