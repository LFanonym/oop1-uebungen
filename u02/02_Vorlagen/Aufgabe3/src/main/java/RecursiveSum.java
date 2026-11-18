import java.util.Arrays;
import java.util.Random;

public class RecursiveSum {
	void main() {
		int[] valuesToSum = randomSeries(1000);

		IO.println(sumOfArray(valuesToSum));
	}
	
	int[] randomSeries(int amount) {
		Random random = new Random(4711);
		int[] values = new int[amount];

		for (int index = 0; index < amount; index++) {
			values[index] = random.nextInt(100);
		}

		return values;
	}

	int sumOfArray(int[] input) {
		if (input.length == 0) {
			return 0;
		}
		return input[0] + sumOfArray(Arrays.copyOfRange(input, 1, input.length));
	}
}
