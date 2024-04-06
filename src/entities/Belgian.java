package entities;

public class Belgian extends CafeShop {
    private String FinCode;

    public Belgian(int ID, String name, String surname, String password, String email, String username, String finCode) {
        super(ID, name, surname, password, email, username);
        FinCode = finCode;
    }
public Belgian() {

}

    public String getFinCode() {
        return FinCode;
    }

    public void setFinCode(String finCode) {
        FinCode = finCode;
    }
}
