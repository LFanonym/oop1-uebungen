

public class BracketChecker {
	private static final char[][] BRACKET_PAIRS = new char[][] { { '(', ')' }, { '<', '>' }, { '[', ']' }, { '{', '}' } };

	public boolean validate(String input) {
		var stack = new OwnStack(input.length());

		// TODO
		throw new UnsupportedOperationException("not implemented yet");
	}

	private boolean handleChar(OwnStack stack, char c) {
		// TODO
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
