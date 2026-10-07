package coffeeshop;

public class CoffeeOrderPosition {

    private final int amount;
    private final String coffeeType;

    public CoffeeOrderPosition(int amount, String coffeeType) {
        this.amount = amount;
        this.coffeeType = coffeeType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getAmount() {
        return amount;
    }

}
