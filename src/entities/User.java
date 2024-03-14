package entities;

import java.util.ArrayList;

public class User extends Account {

    private String phone;
    private String name;
    private ArrayList<Order> historyOrders;

    public User(int id, String email, String password, int rol, String phone, String name) {
        super(id, email, password, rol);
        this.phone = phone;
        this.name = name;
        this.historyOrders = new ArrayList<>();
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

    public ArrayList<Order> getHistoryOrders() {
        return historyOrders;
    }

    public void setHistoryOrders(ArrayList<Order> historyOrders) {
        this.historyOrders = historyOrders;
    }

    public boolean addHistoryOrders (Order order){
        return this.historyOrders.add(order);
    }

    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", historyOrders=" + historyOrders +
                '}';
    }
}
