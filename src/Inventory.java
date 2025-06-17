import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }


    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int durability) {
        items.add(new Tool(name, quantity, durability));
    }

    public void addItem(String name, int quantity) {
        items.add(new Item(name, quantity));
    }

    public void addMoney(int amount) {
        items.add(new Money(amount));
    }


    public void displayInventory() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
