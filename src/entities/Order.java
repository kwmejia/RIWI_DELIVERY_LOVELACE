package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order {
        private Client client;
        private DeliveryMan deliveryMan;
        private int id;
        private ArrayList<Product> product;
        private LocalDate date;
        private LocalTime time;
        private PayMethod payMethod;
        private double totalPrice;
        private boolean status;

        public Order() {
        }

        public Order(int id, PayMethod payMethod, double totalPrice, boolean status,Client client ) {
                this.id = id;
                this.date = LocalDate.now();
                this.time = LocalTime.now();
                this.payMethod = payMethod;
                this.totalPrice = totalPrice;
                this.status = status;
                //Se crea cliente
                this.client = client;
                //Se crea producto
                this.product = new ArrayList<Product>();
        }
        public Order(int id,  PayMethod payMethod, double totalPrice, boolean status,Client client , DeliveryMan deliveryMan) {
                this.id = id;
                this.date = LocalDate.now();
                this.time = LocalTime.now();
                this.payMethod = payMethod;
                this.totalPrice = totalPrice;
                this.status = status;
                this.deliveryMan = deliveryMan;
                this.client = client;
                //Se crea producto
                this.product = new ArrayList<Product>();
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public PayMethod getPayMethod() {
                return payMethod;
        }

        public void setPayMethod(PayMethod payMethod) {
                this.payMethod = payMethod;
        }

        public double getTotalPrice() {
                return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
                this.totalPrice = totalPrice;
        }

        public boolean isStatus() {
                return status;
        }

        public void setStatus(boolean status) {
                this.status = status;
        }

        @Override
        public String toString() {
                return
                        "id = " + id + "\n" +
                        "date = " + date + '\n' +
                        "time ='" + time + '\n' +
                        "payMethod =" + payMethod + '\n' +
                        "totalPrice =" + totalPrice + '\n' +
                        "status = " + status
                        ;
        }
}
