import java.util.Random;

public class RecursiveSum {
	void main() {
		int[] valuesToSum = randomSeries(1000);

		// TODO
		// Compute the sum of the above values recursively
	}
	
	int[] randomSeries(int amount) {
		Random random = new Random(4711);
		int[] values = new int[amount];

		for (int index = 0; index < amount; index++) {
			values[index] = random.nextInt(100);
		}

		return values;
	}
}
