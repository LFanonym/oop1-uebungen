public class Eratosthenes {
	private static final int PRIMES_UP_TO = 100;

	void main() {

		oldCalculation();
		IO.println();
		IO.println();

		int[] sievedValues = new int[PRIMES_UP_TO + 1];

		// TODO
		// perform this sequence:
		// 1. initialize sieved values
		// 2. strike out values / sieve
		// 3. report result
	}

	void oldCalculation() {
		int[] sievedValues = new int[PRIMES_UP_TO + 1];
		for (int i = 0; i < sievedValues.length; i++) {
			sievedValues[i] = i;
		}
		sievedValues[0] = -1;

		// Now let's look at each number in the array, starting with 2 as this is the first prime
		for (int i = 2; i < sievedValues.length; i++) {
			int currentValue = sievedValues[i];

			// Has the number already been crossed out?
			if (currentValue < 0) {
				continue;
			}

			int numberToCross = currentValue * 2;
			while (numberToCross <= PRIMES_UP_TO) {
				// we can't really cross an item, but instead set a negative value
				sievedValues[numberToCross] = -numberToCross;
				// And we continue with the next number:
				numberToCross += currentValue;
			}
		}

		IO.print("Found the following prime numbers: ");

		for (int i = 2; i < sievedValues.length; i++) {
			int currentNumber = sievedValues[i];
			if (currentNumber < 0) {
				continue;
			}
			IO.print(currentNumber + ", ");
		}
	}
}
