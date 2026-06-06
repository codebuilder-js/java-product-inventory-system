
import java.util.ArrayList;

class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;
    private String barcode;
    private String supplier;

    public Product(
        int id,
        String name,
        String description,
        double price,
        int quantity,
        String category,
        String barcode,
        String supplier
    ) {
        if(price <= 0) {
            throw new IllegalArgumentException(
                "Price must be positive."
            );
        }

        if(quantity < 0) {
            throw new IllegalArgumentException(
                "Quantity cannot be negative."
            );
        }

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.barcode = barcode;
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return
            "=========== PRODUCT ===========\n" +
            "Product: " + name + "\n" +
            String.format("Price: $%.2f\n", price) +
            "Quantity: " + quantity + "\n" +
            "Category: " + category + "\n" +
            "Supplier: " + supplier + "\n" +
            "==============================\n";

    }

    public void addStock(int quantityAdded) {
        if(quantityAdded <= 0) {
            throw new IllegalArgumentException(
                "Quantity must be greater than zero."
            );
        }

        quantity += quantityAdded;
    }

    public void removeStock(int quantityRemoved) {
        if(quantityRemoved <= 0) {
            throw new IllegalArgumentException(
                "Quantity must be greater than zero."
            );
        }

        if(quantityRemoved > quantity) {
            throw new IllegalStateException(
                "Not enough stock available."
            );
        }

        quantity -= quantityRemoved;
    }

    public void updatePrice(double newPrice) {
        if(newPrice <= 0) {
            throw new IllegalArgumentException(
                "Price must be greater than zero."
            );
        }

        price = newPrice;
    }

    public boolean checkAvailability() {
        return quantity > 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if(product == null) {
            throw new IllegalArgumentException(
                "Product cannot be null."
            );
        }

        if(findProductById(product.getId()) != null) {
            throw new IllegalArgumentException(
                "Product ID alreadry exists."
            );
        }

        if(findProductByBarcode(product.getBarcode()) != null) {
            throw new IllegalArgumentException(
                "Barcode already exists."
            );
        }

        products.add(product);
    }

    public void removeProduct(int id) {
        Product product = findProductById(id);

        if(product == null) {
            throw new IllegalArgumentException(
                "Product not found."
            );
        }

        products.remove(product);
    }

    public Product findProductById(int id) {
        for(Product product : products) {
            if(product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public ArrayList<Product> listProducts() {
        return new ArrayList<>(products);
    }

    public int getTotalProducts() {
        return products.size();
    }

    public void displayInventory() {
        for(Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductByBarcode(String barcode) {
        for(Product product : products) {
            if(product.getBarcode().equals(barcode)) {
                return product;
            }
        }

        return null;
    }

    public double getInventoryValue() {
        double total = 0;

        for(Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }

        return total;
    }

    public void displayUnavailableProducts() {
        for(Product product : products) {
            if(!product.checkAvailability()) {
                System.out.println(product);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(
            new Product(
                1,
                "Notebook",
                "Laptop Dell Inspiron",
                3500.00,
                10,
                "Electronics",
                "123456789",
                "Dell"
            )
        );

        inventory.addProduct(
            new Product(
                2,
                "Mouse",
                "Mouse Wireless Logitech",
                120.00,
                50,
                "Accessories",
                "987654321",
                "Logitech"    
            )
        );

        inventory.addProduct(
            new Product(
                3,
                "Keyboard",
                "Mechanical Keyboard",
                300.00,
                20,
                "Accessories",
                "555555555",
                "Corsair"
            )
        );

        inventory.displayInventory();

        Product product = inventory.findProductById(2);

        if(product != null) {
            System.out.println("Found product:\n" + product);
        }

        System.out.println("Total products: " + inventory.getTotalProducts());

        System.out.printf("Inventory value: $%.2f%n", inventory.getInventoryValue());
    }
}
