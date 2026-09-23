public class RecursiveDoubleFactorial {
	void main() {
		IO.println(doubleFactorial(5));
		IO.println(doubleFactorial(6));
		IO.println(doubleFactorial(1));
		IO.println(doubleFactorial(2));
		IO.println(doubleFactorial(100_000));
	}

	// throws exception at high values
	long doubleFactorial(long n) {
		if (n - 2 < 0) {
			return 1;
		}
		return n * doubleFactorial(n - 2);
	}
}
