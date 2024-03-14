package controller;

import java.util.ArrayList;
import entities.Order;

import javax.swing.*;

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

    public void listarOrdenes (){
        if (listOrder.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay ordenes para mostrar");
        }else{
            String text ="";
            for (Order temporal : listOrder){
                text += "id = " + temporal.getId() + "\n" +
                        "date = " + temporal.getDate() + '\n' +
                        "time ='" + temporal.getTime() + '\n' +
                        "payMethod =" + temporal.getPayMethod() + '\n' +
                        "totalPrice =" + temporal.getTotalPrice() + '\n' +
                        "status = " + temporal.isStatus() + "\n";
            }
            JOptionPane.showMessageDialog(null,text);
        }
    }
}
