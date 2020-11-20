package BasicsOfOOP.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// Создать класс Payment с внутренним классом, с помощью объектов которого
// можно сформировать покупку из нескольких товаров.
public class Payment {
    private double sum;
    private ArrayList<Product> products;

    public Payment() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double amount() {
        for (Product product : products) {
            sum += product.price;
        }
        return sum;
    }

    public void fillBag() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Fill the basket with products.");
        System.out.println("To complete the entry enter \"esc\".");
        try {
            while (true) {
                System.out.print("Input name of product: ");
                String str = reader.readLine();
                if (str.equals("esc")){
                    break;
                }
                Payment.Product product = new Payment.Product();
                product.setName(str);
                System.out.print("Input price of product: ");
                product.setPrice(Double.parseDouble(reader.readLine()));
                int number = 0;
                System.out.print("Input the number of such products in the basket: ");
                number = Integer.parseInt(reader.readLine());
                for (int i = 0; i < number; i++) {
                    products.add(product);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printCheck(){
        System.out.println("\nYour check for payment:");
        for (Product product : products) {
            System.out.printf("%-15s $ %.2f\n", product.name, product.price);
        }
        sum = this.amount();
        System.out.printf("Amount to pay:  $ %.2f\n", sum);
    }

    private class Product{
        private String name;
        private double price;

        public Product() {
        }

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString(){
            return name + "costs $ " + price;
        }
    }
}
