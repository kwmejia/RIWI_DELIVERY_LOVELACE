package entities;

<<<<<<< HEAD
public class User {
=======
public class User extends Account {
>>>>>>> 656cdd43620f8b39527138805d9918ef13ac3fdc

    private String phone;
    private String name;

<<<<<<< HEAD

    public User(){

=======
    public User(int id, String email, String password, int rol, String phone, String name) {
        super(id, email, password, rol);
        this.phone = phone;
        this.name = name;
>>>>>>> 656cdd43620f8b39527138805d9918ef13ac3fdc
    }

    public User(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

<<<<<<< HEAD
=======
    public User() {
    }

>>>>>>> 656cdd43620f8b39527138805d9918ef13ac3fdc
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
