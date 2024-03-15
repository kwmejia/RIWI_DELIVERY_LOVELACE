package entities;

import java.util.Scanner;



public class Client extends User{
    private String address;

    public Client (){

    }
    public Client(int id, String email, String password, int rol, String phone, String name, String address) {
        super(id, email, password, rol, phone, name);
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
