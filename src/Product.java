public class Product {
    private static int id;
    private double price;
    private String name;
    private String category;

    public Product(double price, String name, String category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Product.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id ="+ id +
                "price=" + price +
                ", name='" + name +
                ", category='" + category + '\'' +
                '}';
    }
}

