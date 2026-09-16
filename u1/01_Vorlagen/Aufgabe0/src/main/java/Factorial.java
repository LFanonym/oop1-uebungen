import util.SimpleIO;

public class Factorial {
    void main() {
        int number = SimpleIO.readInt("Fakultät für 'n': ");
        if (number < 0) {
            IO.println("Undefined");
        } else if (number > 12) {
            IO.println("Too large");
        } else {
            IO.println(factorial(number));
        }
    }

	int factorial(int number) {
        int product = 1;
        int counter = 1;
        while (counter <= number) {
            product *= counter;
            counter++;
        }
        return product;
    }
}
