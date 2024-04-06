package entities;

public class CafeShop {
    private int ID;
    private String name;
    private String surname;
    private String password;
    private String email;
    private String username;

    public CafeShop(int ID, String name, String surname, String password, String email, String username) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.username = username;
    }
    public  CafeShop() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
