import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1, "Cement", "Materials", 32.50, 20));
        inventory.add(new Product(2, "Steel Rod", "Materials", 45.00, 15));
        inventory.add(new Product(3, "Paint Bucket", "Finishes", 28.90, 10));

        System.out.println("Inventory Management System");
        System.out.println("---------------------------");

        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}