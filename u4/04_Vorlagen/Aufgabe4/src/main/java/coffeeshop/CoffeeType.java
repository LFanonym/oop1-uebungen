package coffeeshop;

public enum CoffeeType {
    ESPRESSO("Klein", 2, false), LATTE("Gross", 1, false), AMERICANO("Mittel", 2, true), MOCHA("Mittel", 1, false);


    private String size;
    private int amountOfShots;
    private boolean decaf;

    public String getSize() {
        return size;
    }

    public int getAmountOfShots() {
        return amountOfShots;
    }

    public boolean isDecaf() {
        return decaf;
    }

    CoffeeType(String size, int amountOfShots, boolean decaf) {
        this.size = size;
        this.amountOfShots = amountOfShots;
        this.decaf = decaf;
    }
}
