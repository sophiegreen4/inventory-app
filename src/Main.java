//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item = new Item("Map", 1);
//      Fruit fruit = new Fruit( "Apple", 20, "Fuji");
//      Tool tool = new Tool("Garden tool", 2, 75, "Shovel");

        inventory.addItem(item);
        inventory.addItem("Apple", 20, "Fuji");
        inventory.addItem("Garden tool", 2, 75, "Shovel");

        inventory.displayInventory();

    }
}