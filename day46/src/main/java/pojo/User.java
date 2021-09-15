package pojo;

public class User {
    private String user;
    private String password;

    public User() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.user = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
