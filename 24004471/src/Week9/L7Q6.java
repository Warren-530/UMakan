package Week9;
/*
import java.util.ArrayList;
import java.io.*;

class Order {
    private String orderNum;
    private String orderCode;
    private int quantity;

    public Order(String orderNum, String orderCode, int quantity) {
        this.orderNum = orderNum;
        this.orderCode = orderCode;
        this.quantity = quantity;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Product {
    private String productID;
    private String productName;
    private double price;

    public Product(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class L7Q6 {
    public static void main(String[] args) {
        try {
            BufferedReader orderReader = new BufferedReader(new FileReader("D:\\InputAndOutput\\order.txt"));
            BufferedReader productReader = new BufferedReader(new FileReader("D:\\InputAndOutput\\product.txt"));

            ArrayList<Order> orders = new ArrayList<>();
            ArrayList<Product> products = new ArrayList<>();

            // Reading orders
            String line;
            while ((line = orderReader.readLine()) != null) {
                String[] parts = line.split(",");
                String orderNum = parts[0].trim();
                String orderCode = parts[1].trim();
                int orderQuantity = Integer.parseInt(parts[2].trim());
                orders.add(new Order(orderNum, orderCode, orderQuantity));
            }

            // Reading products
            String read;
            while ((read = productReader.readLine()) != null) {
                String[] parts = read.split(",");
                String productID = parts[0].trim();
                String productName = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim());
                products.add(new Product(productID, productName, price));
            }

            orderReader.close();
            productReader.close();

            // Display table header
            System.out.printf("%-15s %-20s %-10s %-15s %-10s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");

            // Display matching records
            for (Order order : orders) {
                for (Product product : products) {
                    if (order.getOrderCode().equals(product.getProductID())) {
                        double total = product.getPrice() * order.getQuantity();
                        System.out.printf("%-15s %-20s %-10d %-15.2f %-10.2f\n",
                                product.getProductID(),
                                product.getProductName(),
                                order.getQuantity(),
                                product.getPrice(),
                                total);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File cannot be read: " + e.getMessage());
        }
    }
}
*/