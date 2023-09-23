package bookstoreproject.inventory;

public class Inventory {

    private int bookStock = 10;
    private int stationaryStock = 20;
    private int pencilStock = 30;
    private int penStock = 40;

    public boolean isAvailable(String productType, int quantity) {
        switch (productType) {
            case "Book":
                return bookStock >= quantity;
            case "Stationary":
                return stationaryStock >= quantity;
            case "Pencil":
                return pencilStock >= quantity;
            case "Pen":
                return penStock >= quantity;
            default:
                return false;
        }
    }

    public void decrementStock(String productType, int quantity) {
        switch (productType) {
            case "Book":
                bookStock -= quantity;
                break;
            case "Stationary":
                stationaryStock -= quantity;
                break;
            case "Pencil":
                pencilStock -= quantity;
                break;
            case "Pen":
                penStock -= quantity;
                break;
        }
    }
}


