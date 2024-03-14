package entities;

public class DeliveryMan extends User{
    private String vehicle;
    private String plate;
    private double document;
    private boolean status;

    //Constructor vacion
    public DeliveryMan(){
        this.vehicle = "";
        this.plate = "";
        this.document = 0;
        this.status = false;
    }

    //Constructor con parametros heredando de USER
    public DeliveryMan(String phone, String name, String vehicle, String plate, double document, boolean status) {
        super(phone, name);
        this.vehicle = vehicle;
        this.plate = plate;
        this.document = document;
        this.status = status;
    }


    //Metodos getters y setters

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getDocument() {
        return document;
    }

    public void setDocument(double document) {
        this.document = document;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "DeliveryMan{" +
                "vehicle='" + vehicle + '\'' +
                ", plate='" + plate + '\'' +
                ", document=" + document +
                ", status=" + status +
                '}';
    }
}
