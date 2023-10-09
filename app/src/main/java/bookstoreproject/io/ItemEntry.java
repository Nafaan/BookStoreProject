package bookstoreproject.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ItemEntry throws IOException {
    private String product;
    private int quantity;
    private double price;

    public ItemEntry(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    
    public static ItemEntry readEntryFromFile(String filename) throws IOException {
        try (Scanner scanner = new Scanner(new File(filename))) {
            
            if (!scanner.hasNext()) {
                throw new IOException("File is empty!");
            }

            String product = scanner.next();
            int quantity = scanner.nextInt();
            double price = scanner.nextDouble();

            return new ItemEntry(product, quantity, price);
        }
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

