package controller;

import java.util.ArrayList;

import entities.*;

import javax.swing.*;

public class OrderController {

    private ArrayList<Order> listOrder;

    public OrderController() {
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

    public void listarOrdenes() {
        if (listOrder.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ordenes para mostrar");
        } else {
            String text = "";
            for (Order temporal : listOrder) {
                text += "id = " + temporal.getId() + "\n" +
                        "date = " + temporal.getDate() + '\n' +
                        "time ='" + temporal.getTime() + '\n' +
                        "payMethod =" + temporal.getPayMethod() + '\n' +
                        "totalPrice =" + temporal.getTotalPrice() + '\n' +
                        "status = " + temporal.isStatus() + "\n";
            }
            JOptionPane.showMessageDialog(null, text);
        }
    }


    //Method List Pending Order
    public void listPendingOrder(Client client) {

        String orderPending = "";
        for (Order orden : this.listOrder) {

            //check that the client match
            if (orden.getClient().getId() == client.getId()) {
                if (orden.getDeliveryMan() == null) {
                    orderPending.concat(orden.toString() + "\n");
                }

            }

        }
        JOptionPane.showMessageDialog(null, orderPending);
    }

    public void listarProductos(ArrayList<Product> listProduct) {
        String list = "";
        for (Product iterador : listProduct) {
            list += iterador.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, list);
    }

    public ArrayList<Product> pedirProducto(ArrayList<Product> listProduct) {

        ArrayList<Product> listProductTaken = new ArrayList<>();

        int continueAddProduct = 1;

        do {
            listarProductos(listProduct);
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto que desea pedir: "));

            for (Product iterador : listProduct) {
                if (iterador.getId() == id) {
                    listProductTaken.add(iterador);
                }
            }
            continueAddProduct = JOptionPane.showConfirmDialog(null, "Quieres seguir agregando productos?");
        } while (continueAddProduct != 1);

        return listProductTaken;
    }

    public PayMethod payMethod() {
        String payMethod = JOptionPane.showInputDialog(null, """
                ELige el metodo de pago
                                
                1. Efectivo.
                2. Tarjeta.
                                
                """);
        return payMethod.equals("1") ? PayMethod.CASH : PayMethod.CARD;
    }

    public double calculateTotal(ArrayList<Product> listProduct) {
        double total = 0;
        for (Product product : listProduct) {
            total += product.getPrice();
        }
        return total;
    }

    public void createOrder(ArrayList<Product> listProduct, Client client) {
        ArrayList<Product> askedProducts = pedirProducto(listProduct);
        int id = Math.toIntExact(System.currentTimeMillis());

        Order orden = new Order(id, payMethod(), calculateTotal(askedProducts), true, client);

        boolean addCorrect = this.listOrder.add(orden);
        JOptionPane.showMessageDialog(null, addCorrect ? "Orden registrada correctamente " : "No se pudo guardar la orden");
    }
}
