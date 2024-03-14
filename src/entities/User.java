package entities;

public class User extends Account {

    private String phone;
    private String name;

    public User(int id, String email, String password, int rol, String phone, String name) {
        super(id, email, password, rol);
        this.phone = phone;
        this.name = name;
    }

    public User(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public User() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "entities.User{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
