/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bookstoreproject;

import java.util.ArrayList;

import bookstoreproject.inventory.*;
import bookstoreproject.sales.*;
import bookstoreproject.io.*;

public class App {
    public String makeAnnouncement() {
        return "Starting Project";
    }

    public static void main(String[] args) {
        System.out.println(new App().makeAnnouncement());
        // Initialize the Inventory and Sales classes
        InventoryMgnt inventory_mgnt = new InventoryMgnt();
        InventoryItem bookItem = InventoryItem.createInventoryItem(inventory_mgnt,"Book", 20, 14.0);
        InventoryItem penItem = InventoryItem.createInventoryItem(inventory_mgnt,"Pen", 20, 2.0);
        InventoryItem pencilItem = InventoryItem.createInventoryItem(inventory_mgnt,"Pencil", 20, 1.0);
        InventoryItem stationaryItem = InventoryItem.createInventoryItem(inventory_mgnt,"Stationary", 20, 4.0);

        ArrayList<ItemEntry> entries = ItemEntry.readEntriesFromFile("inventory_items.txt");
            
        for(ItemEntry entry : entries) {
            InventoryItem newItem = InventoryItem.createInventoryItem(inventory_mgnt, entry.getProduct(), entry.getQuantity(), entry.getPrice());
        }
    
        Sales sales = new Sales(inventory_mgnt);

          // Header
          System.out.printf("%-15s %-15s %-15s%n", "Product", "Availability", "Price");

          // Display initial inventory and pricing for demonstration
          System.out.printf("%-15s %-15s %-15.2f%n", "Books", inventory_mgnt.isAvailable(bookItem, 1), bookItem.getPricingInfo().getPrice());
          System.out.printf("%-15s %-15s %-15.2f%n", "Stationary", inventory_mgnt.isAvailable(stationaryItem, 1), stationaryItem.getPricingInfo().getPrice());
          System.out.printf("%-15s %-15s %-15.2f%n", "Pencils", inventory_mgnt.isAvailable(pencilItem, 1), pencilItem.getPricingInfo().getPrice());
          System.out.printf("%-15s %-15s %-15.2f%n", "Pens", inventory_mgnt.isAvailable(penItem, 1), penItem.getPricingInfo().getPrice());
  
          // Perform some sales transactions and show results
          System.out.println("\nSales Transactions:");
          boolean bookSale = sales.makeSale(bookItem, 2);
          System.out.printf("Sold 2 Books: %-5s%n", bookSale);
  
          boolean pencilSale = sales.makeSale(pencilItem, 5);
          System.out.printf("Sold 5 Pencils: %-5s%n", pencilSale);
  
          boolean stationarySale = sales.makeSale(stationaryItem, 3);
          System.out.printf("Sold 3 Stationary items: %-5s%n", stationarySale);
  
          // Display class name using Reflection for demonstration
          System.out.printf("\nClass of Sales object: %s%n", sales.getClass().getSimpleName());
  
          // If there's a static SalesCounter class to track total sales
          // System.out.printf("Total Sales: %d%n", SalesCounter.totalSales);
  
          // Exit the program
          System.out.println("\nExiting the program.");
    }
}
