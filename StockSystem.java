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

    public String getFormattedInfo() {
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
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(
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

        products.add(
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

        products.add(
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

        System.out.println(products.get(0).displayInfo());

        for(Product product : products) {
            System.out.println(product.displayInfo());
        }
    }
}
