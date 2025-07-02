import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private int totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void computeTotalPrice() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        this.totalPrice = 0;
        for (Product product : products) {
            this.totalPrice += product.getPrice();
        }
    }
}
