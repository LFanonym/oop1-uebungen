import util.SimpleIO;

public class DoubleFactorial {
	void main() {
		int number = SimpleIO.readInt("Doppel-Fakultät für 'n': ");
		if (number < 0) {
			IO.println("Undefined");
		} else if (number > 69 || (number % 2 == 0 && number > 60)) {
			IO.println("Too large");
		} else {
			IO.println(doubleFactorial(number));
		}
	}

	private long doubleFactorial(int input) {
		long product = 1;
		int counter = 2 - (input % 2);
		while (counter <= input) {
			product *= counter;
			counter += 2;
		}
		return product;
	}
}
