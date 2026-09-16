import java.util.Random;

public class Statistics {
	void main() {
		double[] series = randomSeries(10000);

		// implement statistical analysis
		// TODO
	}

	double[] randomSeries(int amount) {
		double[] series = new double[amount];
		Random random = new Random(4711);

		for (int index = 0; index < amount; index++) {
			series[index] = random.nextDouble() * 10;
		}

		// Patch for reproducible min and max
		series[0] = -72.71D;
		series[1] = 12345.67D;

		return series;
	}
}
