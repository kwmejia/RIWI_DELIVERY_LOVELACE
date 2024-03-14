package controller;

import java.util.ArrayList;

import entities.Client;
import entities.Order;
import entities.User;

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


    //Method List Pending Order
    public void listPendingOrder(Client client){

        String orderPending = "";
        for(Order orden : this.listOrder){

            //check that the client match
            if(orden.getClient().getId() == client.getId()){
                if (orden.getDeliveryMan() == null){
                    orderPending.concat(orden.toString()+"\n");
                }

            }

        }
        JOptionPane.showMessageDialog(null, orderPending);

    }
}
