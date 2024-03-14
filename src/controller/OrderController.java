package controller;

import java.util.ArrayList;
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

    public void closeOrder (User user){
        if (listOrder.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay ordenes para cerrar");
        }else{
            this.listarOrdenes();
            String codigo = JOptionPane.showInputDialog("Ingresa el ID de la order que deseas cerrar");
            Order orderClosed = searchById(codigo);
            if(orderClosed!=null){
                orderClosed.setStatus(false);
                listOrder.removeIf(order -> order.getId()==Integer.parseInt(codigo));
                user.addHistoryOrders(orderClosed);
                JOptionPane.showMessageDialog(null,"Pedido cerrado correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"No se puedo cerrar el pedido");
            }
        }
    }

    public Order searchById(String codigoBuscar){
        for (Order temporal : this.listOrder){
            if (temporal.getId() == Integer.parseInt(codigoBuscar)){
                return temporal;
            }
        }
        return  null;
    }
}
