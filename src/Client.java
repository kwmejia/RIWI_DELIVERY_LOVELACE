import java.util.Scanner;



public class Client {
    private String address;
    Scanner objScan = new Scanner(System.in);


    public Client (){

    }

    private Client(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public void addAddress( ) {
//        System.out.println("Ingese addres: ");
//        String direccion = objScan.nextLine();
//        System.out.println(direccion);
//
//    }

    @Override
    public String toString() {
        return "Client{" +
                "address='" + address + '\'' +
                '}';
    }
}
