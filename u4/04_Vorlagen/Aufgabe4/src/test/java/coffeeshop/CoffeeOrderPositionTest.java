package coffeeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeOrderPositionTest {

    @Test
    void canCreatePosition() {
        var position = new CoffeeOrderPosition(2, CoffeeType.ESPRESSO);

        assertEquals(2, position.getAmount());
        assertEquals(CoffeeType.ESPRESSO, position.getCoffeeType());
    }
}
