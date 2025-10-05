package sixth_week.source_code.module_11.tasks;

public class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.id = "U" + System.currentTimeMillis();
    }

    public boolean login(String username, String password) {
        if (this.username == null || this.password == null) {
            return false;
        }
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean login(String phoneOrUsrname, String password, boolean isPhone) {
        if (this.password == null)
            return false;

        if (isPhone) {
            if (this.phone == null)
                return false;
            return this.phone.equals(phoneOrUsrname) && this.password.equals(password);
        } else {
            if (this.username == null)
                return false;
            return this.username.equals(phoneOrUsrname) && this.password.equals(password);
        }
    }

    public void displayInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Phone: " + this.phone);
    }

    protected String getUsernameInternal() {
        return this.username;
    }
}