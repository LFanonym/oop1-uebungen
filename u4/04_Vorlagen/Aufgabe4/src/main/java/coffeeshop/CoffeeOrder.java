package coffeeshop;

import java.util.*;

public class CoffeeOrder {

    private final CoffeeOrderPosition[] positions;
    private int currentIdx = 0;

    public CoffeeOrder(int size) {
        positions = new CoffeeOrderPosition[size];
    }

    public void add(int amount, CoffeeType coffeeType) {
        if (currentIdx < positions.length)
        {
            positions[currentIdx] = new CoffeeOrderPosition(amount, coffeeType);

            currentIdx++;
        }
        else
        {
            IO.println("Kein Platz für weitere Bestellungen!");
        }
    }

    public int getCurrentIdx() {
        return currentIdx;
    }

    public void setCurrentIdx(int currentIdx) {
        this.currentIdx = currentIdx;
    }

    public CoffeeOrderPosition[] getPositions() {
        return Arrays.copyOf(positions, positions.length);
    }

    public void print() {
        IO.println("You ordered:");
        for (var coffeeOrderPosition : positions) {
            IO.println(coffeeOrderPosition.getAmount() + " times " + coffeeOrderPosition.getCoffeeType());
        }
    }
}
