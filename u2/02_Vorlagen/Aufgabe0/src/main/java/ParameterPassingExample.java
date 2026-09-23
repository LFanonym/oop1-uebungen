void main() {
	symbolSquare('$', 5);
}

void symbolSquare(char symbol, int amount) {
	int columns = amount;
	for (int i = 1; i <= amount; i++) {
		symbolLine(symbol, columns);
		columns--;
	}
}

void symbolLine(char symbol, int amount) {
	for (int i = 1; i <= amount; i++) {
		IO.print(symbol);
	}
	IO.println();
}
