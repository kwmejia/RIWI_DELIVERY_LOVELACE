package entities;

import java.util.ArrayList;

public class OrderController {

    private ArrayList<Order> listOrder;

    public OrderController(){
        this.listOrder = new ArrayList<>();
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }

    @Override
    public String toString() {
        return "OrderController{" +
                "listOrder=" + listOrder +
                '}';
    }
}
