public class Tool extends Item{
    private int durability;
    private String type;

    public Tool(String name, int quantity, int durability, String type) {
        super(name, quantity);
        this.durability = durability;
        this.type = type;
    }

    public int getDurability() {
        return durability;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return "Tool: " + getName() + ", Quantity: " + getQuantity() + ", Durability: " + getDurability() + ", Type: " + type;
    }
}
