package entities;

import java.util.Scanner;



<<<<<<< HEAD
public class Client {
    private String address;


    public Client (){

    }

    private Client(String address) {
=======
public class Client extends User{
    private String address;

    public Client (){

    }
    public Client(int id, String email, String password, int rol, String phone, String name, String address) {
        super(id, email, password, rol, phone, name);
>>>>>>> 656cdd43620f8b39527138805d9918ef13ac3fdc
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
<<<<<<< HEAD
        return "Client{" +
=======
        return super.toString +
>>>>>>> 656cdd43620f8b39527138805d9918ef13ac3fdc
                "address='" + address + '\'' +
                '}';
    }
}
