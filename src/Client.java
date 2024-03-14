import java.util.Scanner;



public class Client extends User{
    private String address;

    public Client (){

    }

    private Client(String address, String phone, String name) {

        super(phone, nombre);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return super.toString +
                "address='" + address + '\'' +
                '}';
    }
}
