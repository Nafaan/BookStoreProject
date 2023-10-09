package bookstoreproject.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemEntry {
    private String product;
    private int quantity;
    private double price;

    public ItemEntry(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    
    public static ArrayList<ItemEntry> readEntriesFromFile(String filename) {
        ArrayList<ItemEntry> entries = new ArrayList<>();
        
        try  {
            Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNext()) {
                String product = scanner.next();
                int quantity = scanner.nextInt();
                double price = scanner.nextDouble();
                entries.add(new ItemEntry(product, quantity, price));
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        } 
        return entries;
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

