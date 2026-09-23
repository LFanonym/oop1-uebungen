void main() {
	symbolSquare('$', 5);
}

void symbolSquare(char symbol, int amount) {
	for (int i = 1; i <= amount; i++) {
		symbolLine(symbol, amount);
	}
}

void symbolLine(char symbol, int amount) {
	for (int i = 1; i <= amount; i++) {
		IO.print(symbol);
	}
	IO.println();
}
