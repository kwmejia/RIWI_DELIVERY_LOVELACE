package entities;

public class Order {
//      private Client client;
//      private DeliveryMan deliveryMan;
        private int id;
//      private Product[] product;
        private String date;
        private String time;
        private PayMethod payMethod;
        private double totalPrice;
        private boolean status;

        public Order() {
        }

        public Order(int id, String date, String time, PayMethod payMethod, double totalPrice, boolean status) {
                this.id = id;
                this.date = date;
                this.time = time;
                this.payMethod = payMethod;
                this.totalPrice = totalPrice;
                this.status = status;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }

        public String getTime() {
                return time;
        }

        public void setTime(String time) {
                this.time = time;
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
                return "Order{" +
                        "id=" + id +
                        ", date='" + date + '\'' +
                        ", time='" + time + '\'' +
                        ", payMethod=" + payMethod +
                        ", totalPrice=" + totalPrice +
                        ", status=" + status +
                        '}';
        }
}
