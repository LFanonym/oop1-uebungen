package coffeeshop;

public class CoffeeShopOrderExample {

    void main() {
        var order = new CoffeeOrder(4);

        order.add(4, CoffeeType.ESPRESSO);
        order.add(3, CoffeeType.MOCHA);
        order.add(2, CoffeeType.LATTE);
        order.add(1, CoffeeType.AMERICANO);

        // order.add(13, "NIX");

        order.print();
    }
}
