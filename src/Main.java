//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Inventory inventory = new Inventory();

       System.out.println("Inside pockets: ");

       inventory.addMoney(10);
       inventory.addItem("Map", 1);
       inventory.addItem("Apple", 10, "Red");
       inventory.addItem("Shovel", 2, 75);
       inventory.addItem("Axe", 1, 15);
       inventory.addItem("Fishing net", 1);
       inventory.addItem("Fossil", 6);

       inventory.displayInventory();

    }
}