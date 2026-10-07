package coffeeshop;

public class CoffeeShopOrderExample {

    void main() {
        var order = new CoffeeOrder(4);

        order.add(4, "ESPRESSO");
        order.add(3, "MOCHA");
        order.add(2, "LATTE");
        order.add(1, "AMERICANO");

        // order.add(13, "NIX");

        order.print();
    }
}
