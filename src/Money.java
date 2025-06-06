public class Money extends Item{

    public Money(int amount) {
        super("Money", amount);
    }

    public int getMoney() {
        return getQuantity();
    }

    @Override
    public String toString() {
        return "Wallet: £" + getMoney();
    }
}


