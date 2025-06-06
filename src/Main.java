//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

       System.out.println("Your inventory is: ");

       inventory.addMoney(10);
       inventory.addItem("Map", 1);
       inventory.addItem("Apple", 10, "Red");
       inventory.addItem("Garden tool", 2, 75, "Shovel");
       inventory.addItem("Fishing pole", 1);

       inventory.displayInventory();

    }
}