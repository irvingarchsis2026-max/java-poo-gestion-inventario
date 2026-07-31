import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public boolean updateStock(int id, int newStock) {
    Product product = findProductById(id);

    if (product != null) {
        product.setStock(newStock);
        return true;
    }

    return false;
    }
}
