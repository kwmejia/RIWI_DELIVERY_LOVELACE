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
            for (Order temporal : listOrder){
                JOptionPane.showMessageDialog(null,temporal.toString());
            }

        }
    }
}
