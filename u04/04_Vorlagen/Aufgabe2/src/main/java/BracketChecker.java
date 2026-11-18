

public class BracketChecker {
	private static final char[][] BRACKET_PAIRS = new char[][] { { '(', ')' }, { '<', '>' }, { '[', ']' }, { '{', '}' } };

	public boolean validate(String input) {
		var stack = new OwnStack(input.length());

		var inputArray = input.toCharArray();
		for (char c: inputArray) {
			if (!handleChar(stack, c)) {
				return false;
			}
		}
        return stack.isEmpty();
    }

	private boolean handleChar(OwnStack stack, char c) {
		if (isOpeningBracket(c)) {
			stack.push(String.valueOf(c));
		}
		if (isClosingBracket(c)) {
			var expected = getOpening(c);
			char actual = stack.pop().toCharArray()[0];
            return expected != null && expected == actual;
		}
		return true;
	}

	private Character getOpening(char c) {
		for (char[] pair : BRACKET_PAIRS) {
			if (pair[1] == c) {
				return pair[0];
			}
		}
		return null;
	}

	private boolean isClosingBracket(char c) {
		for (char[] pair : BRACKET_PAIRS) {
			if (pair[1] == c) {
				return true;
			}
		}
		return false;
	}

	private boolean isOpeningBracket(char c) {
		for (char[] pair : BRACKET_PAIRS) {
			if (pair[0] == c) {
				return true;
			}
		}
		return false;
	}
}
