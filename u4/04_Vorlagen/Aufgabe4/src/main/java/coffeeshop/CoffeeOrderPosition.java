package coffeeshop;

public class CoffeeOrderPosition {

    private final int amount;
    private final CoffeeType coffeeType;

    public CoffeeOrderPosition(int amount, CoffeeType coffeeType) {
        this.amount = amount;
        this.coffeeType = coffeeType;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public int getAmount() {
        return amount;
    }

}
