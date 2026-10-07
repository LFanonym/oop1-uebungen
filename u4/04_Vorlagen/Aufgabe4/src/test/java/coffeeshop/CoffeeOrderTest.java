package coffeeshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeOrderTest {

    @Test
    void orderIsInitiallyEmpty() {
        var coffeeOrder = new CoffeeOrder(4);

        assertEquals(0, coffeeOrder.getCurrentIdx());
    }

    @Test
    void canAddOrderPosition() {
        var coffeeOrder = new CoffeeOrder(4);
        coffeeOrder.add(3, "ESPRESSO");

        assertEquals(1, coffeeOrder.getCurrentIdx());

        coffeeOrder.add(7, "LATTE");
        assertEquals(2, coffeeOrder.getCurrentIdx());

        var first = coffeeOrder.getPositions()[0];

        assertAll(() -> assertEquals(3, first.getAmount()),
                  () -> assertEquals("ESPRESSO", first.getCoffeeType()));
    }
}
