public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(
                new Product(1, "Cement", "Materials", 32.50, 20)
        );

        inventory.addProduct(
                new Product(2, "Steel Rod", "Materials", 45.00, 15)
        );

        inventory.addProduct(
                new Product(3, "Paint Bucket", "Finishes", 28.90, 10)
        );

        System.out.println("Inventory Management System");
        System.out.println("---------------------------");

        System.out.println("Initial inventory:");
        inventory.listProducts();

        Product foundProduct = inventory.findProductById(2);

        if (foundProduct != null) {
            System.out.println("\nSearch result:");
            System.out.println(foundProduct);
        } else {
            System.out.println("\nProduct not found.");
        }

        boolean stockUpdated = inventory.updateStock(2, 25);

        if (stockUpdated) {
            System.out.println("\nStock updated successfully.");
        } else {
            System.out.println("\nProduct not found. Stock was not updated.");
        }

        System.out.println("\nUpdated inventory:");
        inventory.listProducts();
    }
}